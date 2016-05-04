package titarenko.project.javarestaurant.web.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import titarenko.project.javarestaurant.LoggedUser;
import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.service.RestaurantService;

import java.util.List;

/**
 * Created by MyMac on 4/27/16.
 */
@Controller
public class RestaurantRestController {

    private static final Logger LOG = LoggerFactory.getLogger(RestaurantRestController.class);

    @Autowired
    private RestaurantService service;

    public List<Restaurant> getAll() {

        LOG.info("getAll for Restaurants");
        return service.getAll();
    }
}
