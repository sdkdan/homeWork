package Casino;

public class Card {
    private int creditsBalance;

    private int balanceTickets;

    private int cardNumber;

    public Card(int creditsBalance, int balanceTickets, int carNumber) {
        this.creditsBalance = creditsBalance;
        this.balanceTickets = balanceTickets;
        this.cardNumber = carNumber;
    }

    public int getCreditsBalance() {
        return creditsBalance;
    }

    public void setCreditsBalance(int creditsBalance) {
        this.creditsBalance = creditsBalance;
    }

    public int getBalanceTickets() {
        return balanceTickets;
    }

    public void setBalanceTickets(int balanceTickets) {
        this.balanceTickets = balanceTickets;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int carNumber) {
        this.cardNumber = carNumber;
    }
}
