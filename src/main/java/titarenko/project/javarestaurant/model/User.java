package model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by MyMac on 03.04.16.
 */
public class User {


    protected String email;

    protected String password;

    protected Date registered = new Date();

    protected Set<Role> roles;

    protected Map<Integer,LocalDateTime> vote;




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

    public boolean isVoted(){
        return this.vote !=null;
    }
}
