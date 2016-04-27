package titarenko.project.javarestaurant.repository.memory;


import titarenko.project.javarestaurant.model.Dish;

import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.repository.RestaurantRepository;
import titarenko.project.javarestaurant.util.RestaurantUtil;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by MyMac on 06.04.16.
 */
public class InMemoryRestaurantRepositoryImpl implements RestaurantRepository {

    public static final Comparator<Restaurant> USER_MEAL_COMPARATOR = Comparator.comparing((java.util.function.Function<Restaurant, Integer>) restaurant -> restaurant.getVotes().size()).reversed();

    private Map<Integer, Restaurant> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        RestaurantUtil.rest.forEach(this::save);
    }

    {
        for (Map.Entry<Integer, Restaurant> entry : repository.entrySet()) {
            entry.getValue();
            addVote(entry.getValue().getId(), 100001);
        }
        addVote(2, 100002);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        Integer restaurantId = restaurant.getId();
        if (restaurant.isNew()) {
            restaurantId = counter.incrementAndGet();
            restaurant.setId(restaurantId);
        } else if (get(restaurantId) == null) {
            return null;
        }
        repository.put(restaurantId, restaurant);
        return restaurant;
    }

    @Override
    public boolean delete(Integer id) {
        return repository.remove(id) != null;

    }

    @Override
    public Restaurant get(Integer id) {
        Restaurant restaurant = repository.get(id);
        return restaurant == null ? null : restaurant;
    }

    @Override
    public Collection<Restaurant> getAll() {
        return repository == null ?
                Collections.emptyList() :
                repository.values().stream().sorted(USER_MEAL_COMPARATOR).collect(Collectors.toList());
    }


    @Override
    public Restaurant addVote(int restaurantId, int userId) {
        Restaurant restaurant = get(restaurantId);
        if (restaurant == null) return null;
        else {
            Set<Integer> votes = restaurant.getVotes();
            if (votes == null) {
                votes = new HashSet<>();
                votes.add(userId);
                restaurant.setVotes(votes);
            } else {
                votes.add(userId);
                restaurant.setVotes(votes);
            }
        }
        return restaurant;
    }

    @Override
    public Dish saveDish(int restaurantId, Dish dish) {
        Integer dishId = dish.getId();
        Restaurant restaurant = get(restaurantId);
        if (restaurant == null) return null;
        Map<LocalDate, List<Dish>> allRestaurantMenus = restaurant.getMenu();
        if (allRestaurantMenus == null) return null;
        List<Dish> todayMenu = allRestaurantMenus.get(LocalDate.now());
        if (dish.isNew()) {
            dishId = counter.incrementAndGet();
            dish.setId(dishId);
        }else {
            if(!deleteDish(restaurantId,dish.getId()))return null;
            todayMenu.add(dish);
        }
        if (todayMenu == null) {
            todayMenu = new ArrayList<>();
            todayMenu.add(dish);
        } else {
            if (todayMenu.size() > 4) return null;
            else {
                todayMenu.add(dish);
            }
        }
        return dish;
    }

    @Override
    public boolean deleteDish(int restaurantId, Integer dishId) {
        List<Dish> menu = getRestaurantMenu(restaurantId);
        if (menu == null) return false;
        Dish dish = null;
        for (Dish temp : menu) {
            if (temp.getId() == dishId) {
                dish = temp;
            }
        }
        return menu.remove(dish);
    }

    @Override
    public Dish getDish(int restaurantId, int dishId) {
        List<Dish> todayMenu = getRestaurantMenu(restaurantId);
        if (todayMenu == null) return null;
        for (Dish dish : todayMenu) {
            if (dish.getId() == dishId) return dish;
        }
        return null;
    }

    @Override
    public List<Dish> getRestaurantMenu(int restaurantId) {
        Restaurant restaurant = get(restaurantId);
        if (restaurant == null) return null;
        Map<LocalDate, List<Dish>> allRestaurantMenu = restaurant.getMenu();
        if (allRestaurantMenu == null) return null;
        List<Dish> todayMenu = allRestaurantMenu.get(LocalDate.now());
        return todayMenu == null ?
                Collections.emptyList() :
                todayMenu;
    }

}
