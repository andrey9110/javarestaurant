package titarenko.project.javarestaurant.web.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import titarenko.project.javarestaurant.model.User;
import titarenko.project.javarestaurant.service.UserService;

import java.util.List;

/**
 * Created by MyMac on 4/27/16.
 */

public abstract class AbstractUserController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    private UserService service;

    public List<User> getAll() {
        LOG.info("getAll");
        return service.getAll();
    }

    public User get(int id) {
        LOG.info("get " + id);
        return service.get(id);
    }

    public User create(User user) {
        user.setId(null);
        LOG.info("create " + user);
        return service.save(user);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        service.delete(id);
    }

    public void update(User user, int id) {
        user.setId(id);
        LOG.info("update " + user);
        service.update(user);
    }

    public User getByMail(String email) {
        LOG.info("getByEmail " + email);
        return service.getByEmail(email);
    }
}
