package titarenko.project.javarestaurant.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by MyMac on 06.04.16.
 */
public class Restaurant extends NamedEntity {

    protected Set<Integer> votes;

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


    public Set<Integer> getVotes() {
        return votes;
    }

    public void setVotes(Set<Integer> votes) {
        this.votes = votes;
    }


    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public List<Dish> getMenu() {
        return menu;
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
