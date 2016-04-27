package titarenko.project.javarestaurant.repository;

import titarenko.project.javarestaurant.model.User;

import java.util.List;

/**
 * Created by MyMac on 4/25/16.
 */
public interface UserRepository {
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    // null if not found
    User getByEmail(String email);

    List<User> getAll();

    default User getWithVote(int id){
        throw new UnsupportedOperationException();
    }
}
