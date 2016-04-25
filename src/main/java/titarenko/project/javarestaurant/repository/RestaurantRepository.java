package titarenko.project.javarestaurant.repository;



import titarenko.project.javarestaurant.model.Restaurant;

import java.util.Collection;

/**
 * Created by MyMac on 06.04.16.
 */
public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    void delete(Integer id);

    Restaurant get(Integer id);

    Collection<Restaurant> getAll();

}
