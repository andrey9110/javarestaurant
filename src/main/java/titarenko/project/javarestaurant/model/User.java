package titarenko.project.javarestaurant.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by MyMac on 03.04.16.
 */
public class User extends NamedEntity {

    protected String email;

    protected String password;

    protected Date registered = new Date();

    protected boolean enabled = true;

    protected Set<Role> roles;

    protected Map<Integer,LocalDateTime> vote;

    public User() {
    }

    public User(User user) {
        this(user.getId(),user.getName(),user.getEmail(),user.getPassword(),user.getRegistered(),user.isEnabled(),user.getRoles());
    }

    public User(Integer id, String name, String email, String password, Date registered, boolean enabled, Role role, Role... roles) {
        this(id, name, email, password, registered,enabled, EnumSet.of(role, roles));
    }

    public User(Integer id, String name, String email, String password, Date registered, boolean enabled, Set<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.registered = registered;
        this.enabled = enabled;
        this.roles = EnumSet.copyOf(roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Map<Integer, LocalDateTime> getVote() {
        return vote;
    }

    public void setVote(Map<Integer, LocalDateTime> vote) {
        this.vote = vote;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isVoted(){
        return this.vote !=null;
    }
}
