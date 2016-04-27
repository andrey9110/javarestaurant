package titarenko.project.javarestaurant.util;


import titarenko.project.javarestaurant.model.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static titarenko.project.javarestaurant.model.BaseEntity.START_SEQ;

/**
 * Created by MyMac on 06.04.16.
 */
public class DishUtil {

    static  List<Dish> EL_CORASON_MENU = new ArrayList<Dish>(){
        {
            add(new Dish(START_SEQ+1,"Салат Ла Пиовра", 150));
            add(new Dish(START_SEQ+2,"Мидии по-адмиральски", 300));
            add(new Dish(START_SEQ+3,"Сайра по-мексикански", 250));
            add(new Dish(START_SEQ+4,"Устрицы с Гаврским соусом", 500));
        }
    };

     static  List<Dish> OLIO_MENU = new ArrayList<Dish>(){
        {
            add(new Dish(START_SEQ+5,"Лосось с овощами бланш", 420));
            add(new Dish(START_SEQ+6,"Салат Прошутто ди Парма", 300));
            add(new Dish(START_SEQ+7,"Горячий мясной сет Эль Форно", 250));
            add( new Dish(START_SEQ+8,"Бараньи язычки - блюдо из бразильской кухни)", 500));
        }
    };
    static  List<Dish> SVECHA_MENU = new ArrayList<Dish>(){
        {
            add(new Dish(START_SEQ+9,"Цыпленок-гриль с овощами по сезону", 410));
            add(new Dish(START_SEQ+10,"Оленина-гриль с ягодным соусом", 270));
            add(new Dish(START_SEQ+11,"Миньоны из телятины", 350));
            add(new Dish(START_SEQ+12,"Стейк Мраморный Рибай", 500));
        }
    };
}
