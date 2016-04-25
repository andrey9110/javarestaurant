package titarenko.project.javarestaurant.util;


import titarenko.project.javarestaurant.model.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MyMac on 06.04.16.
 */
public class DishUtil {

    public static final List<Dish> EL_CORASON_MENU = Arrays.asList(
            new Dish("Салат Ла Пиовра", 150),
            new Dish("Мидии по-адмиральски", 300),
            new Dish("Сайра по-мексикански", 250),
            new Dish("Устрицы с Гаврским соусом", 500)
    );

    public static final List<Dish> OLIO_MENU = Arrays.asList(
            new Dish("Лосось с овощами бланш", 420),
            new Dish("Салат Прошутто ди Парма", 300),
            new Dish("Горячий мясной сет Эль Форно", 250),
            new Dish("Бараньи язычки - блюдо из бразильской кухни)", 500)
    );

    public static final List<Dish> SVECHA_MENU = Arrays.asList(
            new Dish("Цыпленок-гриль с овощами по сезону", 410),
            new Dish("Оленина-гриль с ягодным соусом", 270),
            new Dish("Миньоны из телятины", 350),
            new Dish("Стейк Мраморный Рибай", 500)
    );


}
