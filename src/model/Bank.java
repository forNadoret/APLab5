package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String id;
    private String name;
    private List<CreditOffer> offers;

    public Bank(String id, String name) {
        this.id = id;
        this.name = name;
        this.offers = new ArrayList<>();
    }

    public boolean addOffer(CreditOffer offer) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean removeOffer(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CreditOffer> getOffers() {
        return offers;
    }
}