package model;

import java.util.ArrayList;
import java.util.List;

public class Selection {
    private List<CreditOffer> selectedOffers;

    public Selection() {
        this.selectedOffers = new ArrayList<>();
    }

    public void addOffer(CreditOffer offer) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean removeOffer(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<CreditOffer> getSelectedOffers() {
        return selectedOffers;
    }
}