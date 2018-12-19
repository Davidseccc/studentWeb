package cz.secda1.studentWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "admin")
public class Admin extends BaseModel {
    @Id
    @GeneratedValue
    long id;
    String login;
    String passwordHash;
    String email;

    public Admin(){
    }

    public Admin(String login, String passwordHash) {
        this.login = login;
        this.passwordHash = passwordHash;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
