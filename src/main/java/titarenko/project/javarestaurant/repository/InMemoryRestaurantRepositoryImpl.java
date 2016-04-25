package titarenko.project.javarestaurant.repository;


import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.util.RestaurantUtil;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by MyMac on 06.04.16.
 */
public class InMemoryRestaurantRepositoryImpl implements RestaurantRepository {

    private Map<Integer,Restaurant> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter  =new AtomicInteger(0);

    {
        RestaurantUtil.RESTAURANTS.forEach(this::save);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        if(restaurant.isNew()){
            restaurant.setId(counter.incrementAndGet());
        }
        repository.put(restaurant.getId(),restaurant);
        return restaurant;
    }

    @Override
    public void delete(Integer id) {
       repository.remove(id);
    }

    @Override
    public Restaurant get(Integer id) {
       return repository.get(id);
    }

    @Override
    public Collection<Restaurant> getAll() {
       return repository.values();
    }
}
