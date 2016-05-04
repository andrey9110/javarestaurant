package titarenko.project.javarestaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titarenko.project.javarestaurant.model.Restaurant;
import titarenko.project.javarestaurant.model.User;
import titarenko.project.javarestaurant.repository.RestaurantRepository;
import titarenko.project.javarestaurant.repository.UserRepository;
import titarenko.project.javarestaurant.util.exceptions.ExceptionUtil;
import titarenko.project.javarestaurant.util.exceptions.NotFoundException;

import java.util.Collection;
import java.util.List;

/**
 * Created by MyMac on 4/27/16.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {


    @Autowired
    private RestaurantRepository repository;

    @Override
    public List<Restaurant> getAll() {
        return repository.getAll();
    }



}
