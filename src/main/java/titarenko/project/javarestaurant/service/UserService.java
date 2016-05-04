package titarenko.project.javarestaurant.service;

import titarenko.project.javarestaurant.model.User;
import titarenko.project.javarestaurant.util.exceptions.NotFoundException;

import java.util.List;

/**
 * Created by MyMac on 4/27/16.
 */
public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user);
}
