public class Withdraw {
    public int customerId;
    public int amount;

    public Withdraw(int customerId, int amount, int currentType, int sourceAccountId) {
        this.customerId = customerId;
        this.amount = amount;
        this.currentType = currentType;
        this.sourceAccountId = sourceAccountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCurrentType() {
        return currentType;
    }

    public void setCurrentType(int currentType) {
        this.currentType = currentType;
    }

    public int getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(int sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public int currentType;
    public int sourceAccountId;
}
