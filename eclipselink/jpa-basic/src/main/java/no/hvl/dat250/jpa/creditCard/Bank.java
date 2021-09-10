package no.hvl.dat250.jpa.creditCard;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private final List<CreditCard> creditCards = new ArrayList<CreditCard>();

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

    @OneToMany
    public List<CreditCard> getCreditCards() {
        return this.creditCards;
    }
}
