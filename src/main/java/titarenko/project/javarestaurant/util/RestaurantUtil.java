package util;

import model.Restaurant;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MyMac on 06.04.16.
 */
public class RestaurantUtil {
    public static final List<Restaurant> RESTAURANTS = Arrays.asList(
            new Restaurant("EL Corason", DishUtil.EL_CORASON_MENU),
            new Restaurant("Olio", DishUtil.OLIO_MENU),
            new Restaurant("Svecha", DishUtil.SVECHA_MENU)
    );


}
