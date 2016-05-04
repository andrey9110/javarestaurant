package titarenko.project.javarestaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titarenko.project.javarestaurant.model.User;
import titarenko.project.javarestaurant.repository.UserRepository;
import titarenko.project.javarestaurant.util.exceptions.ExceptionUtil;
import titarenko.project.javarestaurant.util.exceptions.NotFoundException;

import java.util.List;

/**
 * Created by MyMac on 4/27/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(int id) {
        ExceptionUtil.check(repository.delete(id), id);
    }

    public User get(int id) throws NotFoundException {
        return ExceptionUtil.check(repository.get(id), id);
    }

    public User getByEmail(String email) throws NotFoundException {
        return ExceptionUtil.check(repository.getByEmail(email), "email=" + email);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void update(User user) {
        repository.save(user);
    }
}
