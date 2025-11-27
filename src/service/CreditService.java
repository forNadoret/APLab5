package service;

import model.*;
import storage.BankStorage;

import java.util.List;

public class CreditService {
    private List<Bank> banks;
    private BankStorage storage;
    private Selection selection;

    public CreditService(BankStorage storage) {
        this.storage = storage;
        this.selection = new Selection();
    }

    public void loadData() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void saveData() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void createOffer(String bankId, CreditOffer offer) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<CreditOffer> searchOffers(SearchCriteria criteria) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean updateOffer(String offerId, OfferUpdate data) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean deleteOffer(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean selectOffer(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean removeOfferFromSelection(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<CreditOffer> viewSelection() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Bank> listAllBanks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public CreditOffer findOfferById(String offerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}