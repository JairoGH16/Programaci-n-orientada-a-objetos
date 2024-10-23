package Models;

import java.util.UUID;

public class Person {
    private String id;
    private String Firstname;
    private String Lastname;

    public Person(String Firstname, String Lastname) {
        this.id = UUID.randomUUID().toString();
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

}
