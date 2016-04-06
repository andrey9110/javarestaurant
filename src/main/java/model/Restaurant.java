package model;

import java.util.List;
import java.util.Map;

/**
 * Created by MyMac on 06.04.16.
 */
public class Restaurant extends NamedEntity {

    protected Map<Integer, Integer> votes;

    protected List<Dish> menu;

    public Restaurant(String name, List<Dish> menu) {
        this.name = name;
        this.menu = menu;
    }

    public Restaurant(Integer id, String name, List<Dish> menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Integer> getVotes() {
        return votes;
    }

    public List<Dish> getMenu() {
        return menu;
    }


    public void setVotes(Map<Integer, Integer> votes) {
        this.votes = votes;
    }

    public boolean isVoted(Restaurant restaurant){
        return restaurant.getVotes()!=null;
    }

    @Override
    public String toString() {
        return "RestaurantVoted{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

}
