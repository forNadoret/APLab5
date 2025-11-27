package storage;

import model.Bank;
import java.util.List;

public class FileBankStorage implements BankStorage {
    private String filePath;

    public FileBankStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Bank> loadBanks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void saveBanks(List<Bank> banks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}