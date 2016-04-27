package titarenko.project.javarestaurant.model;

import titarenko.project.javarestaurant.model.Dish;
import titarenko.project.javarestaurant.model.NamedEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by MyMac on 06.04.16.
 */
public class Restaurant extends NamedEntity {

    protected Set<Integer> votes;

    protected Map<LocalDate,List<Dish>> menu;

    public Restaurant(String name,Map<LocalDate,List<Dish>>  todayMenu) {
        this.name = name;
        this.menu = todayMenu;
    }

    public Restaurant(Integer id, String name, Map<LocalDate,List<Dish>>  todayMenu) {
        this.id = id;
        this.name = name;
        this.menu = todayMenu;
    }


    public Set<Integer> getVotes() {
        return votes;
    }

    public void setVotes(Set<Integer> votes) {
        this.votes = votes;
    }


    public void setMenu(Map<LocalDate,List<Dish>>  todayMenu) {
        this.menu = todayMenu;
    }

    public Map<LocalDate,List<Dish>>  getMenu() {
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
