package sedRedenvelopes;

public class User {
    private String name;
    private int totalMoney;

    public User(String name, int totalMoney) {
        this.name = name;
        this.totalMoney = totalMoney;
    }

    public void show() {
        System.out.println(this.name + "的余额是" + this.totalMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
