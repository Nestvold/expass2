package no.hvl.dat250.jpa.creditCard;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String street;
    private Integer number;

    @ManyToMany(mappedBy = "address")
    private final List<Person> people = new ArrayList<Person>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Person> getPeople() {
        return people;
    }
}
