package no.hvl.dat250.jpa.creditCard;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = ".")
    private List<Address> addressList = new ArrayList<Address>();

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

    public List<Address> getAddresses() {
        return this.addressList;
    }

    public void setAddress(List<Address> address) {
        this.addressList = address;
    }

    public void setCreditCards(List<CreditCard> placeHolder) {
        this.creditCards = placeHolder;
    }

    public List<CreditCard> getCreditCards() {
        return this.creditCards;
    }
}
