package titarenko.project.javarestaurant.util;



import titarenko.project.javarestaurant.model.Dish;
import titarenko.project.javarestaurant.model.Restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static titarenko.project.javarestaurant.model.BaseEntity.START_SEQ;

/**
 * Created by MyMac on 06.04.16.
 */
public class RestaurantUtil {

//    public static  List<Restaurant> RESTAURANTS = Arrays.asList(
//            new Restaurant("EL Corason",new HashMap<LocalDate,List<Dish>>() {
//                {
//                    put(LocalDateTime.now().toLocalDate(),DishUtil.EL_CORASON_MENU);
//                }
//            })
//            new Restaurant("EL Corason",new HashMap< LocalDate,List<Dish>>() {
//                {
//                    put(LocalDate.now(),DishUtil.OLIO_MENU);
//                }
//            }),
//            new Restaurant("EL Corason",new HashMap< LocalDate,List<Dish>>() {
//                {
//                    put(LocalDate.now(),DishUtil.SVECHA_MENU);
//                }
//            })
//    );
    public static  List<Restaurant> rest = new ArrayList<Restaurant>(){
        {
            add( new Restaurant("EL Corason",new HashMap<LocalDate,List<Dish>>() {
                {
                    put(LocalDateTime.now().toLocalDate(),DishUtil.EL_CORASON_MENU);
                }
            }));
            add(new Restaurant("Olio",new HashMap< LocalDate,List<Dish>>() {
                {
                    put(LocalDate.now(),DishUtil.OLIO_MENU);
                }
            }));
            add(new Restaurant("Svecha",new HashMap< LocalDate,List<Dish>>() {
                {
                    put(LocalDate.now(),DishUtil.SVECHA_MENU);
                }
            }));
        }
    };




}
