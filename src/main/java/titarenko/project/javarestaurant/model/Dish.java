package titarenko.project.javarestaurant.model;

/**
 * Created by MyMac on 03.04.16.
 */

//Design and implement a JSON API using Hibernate/Spring/SpringMVC (or Spring-Boot) without frontend.
//
//        The task is:
//
//        Build a voting system for deciding where to have lunch.
//
//        2 types of users: admin and regular users
//      -  Admin can input a restaurant and it's lunch menu of the day (2-5 items usually, just a dish name and price)
//      -  Menu changes each day (admins do the updates)
//      -  Users can vote on which restaurant they want to have lunch at
//        Only one vote counted per user
//        If user votes again the same day:
//        If it is before 11:00 we asume that he changed his mind.
//        If it is after 11:00 then it is too late, vote can't be changed
//        Each restaurant provides new menu each day.
//
//        As a result, provide a link to github repository. It should contain the code, README.md with API documentation and couple curl commands to test it.
//        RESTAURANT
//        save()
//        delete()
//        get()
//        getAll()
//        addVote() check time
//
//
//        DISH
//        add()
//        delete()
//        get()
//        getRestaurantMenu()
//        getAll()
//        addNewMenu()

public class Dish extends NamedEntity{

    protected Integer price;

    public Dish(String name, Integer price){
        this(null,name,price);
    }

    public Dish(Integer id, String name, Integer price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
