package no.hvl.dat250.jpa.creditCard;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;
    private Address address;

    @OneToMany(mappedBy = "person")
    private List<CreditCard> creditCards = new ArrayList<CreditCard>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCreditCards(List<CreditCard> placeHolder) {
        this.creditCards = placeHolder;
    }

    public List<CreditCard> getCreditCards() {
        return this.creditCards;
    }
}
