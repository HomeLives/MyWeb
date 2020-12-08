package Day1208.domain;

import java.util.Date;

/**
 * @Author: Frank
 * @Date: 2020/12/8 18:14
 */
public class User {
    private int id;
    private String name;
    private String passwprd;

    public User() {
    }

    public User(int id, String name, String passwprd) {
        this.id = id;
        this.name = name;
        this.passwprd = passwprd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswprd() {
        return passwprd;
    }

    public void setPasswprd(String passwprd) {
        this.passwprd = passwprd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwprd='" + passwprd + '\'' +
                '}';
    }
}
