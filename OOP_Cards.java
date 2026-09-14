public class OOP_Cards {

    private String accountNumber;
    private double balance;

    // Bank hisobidagi operatsiyalar
    private String[] transactionHistory = {
            "Hisob ochildi",
            "100000 so'm pul qo'shildi",
            "20000 so'm pul yechildi"
    };

    // Transaction history ni qaytaradi
    public String[] getTransactionHistory() {
        return transactionHistory;
    }
}