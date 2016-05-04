package titarenko.project.javarestaurant.repository;



import titarenko.project.javarestaurant.model.Dish;
import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.model.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by MyMac on 06.04.16.
 */
public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    boolean delete(Integer id);

    Restaurant get(Integer id);

    List<Restaurant> getAll();

    Restaurant addVote(int restaurantId,int userId);

    Dish saveDish(int restaurantId, Dish dish);

    boolean deleteDish(int restaurantId,Integer dishId);

    Dish getDish(int restaurantId, int dishId);


    List<Dish> getRestaurantMenu(int restaurantId);


}
