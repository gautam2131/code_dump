public class Item {
    private String name;
    private int balance;

    public Item(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(String name, int amount){
        if(name == this.name){
            this.balance += amount;
        }
    }
}
