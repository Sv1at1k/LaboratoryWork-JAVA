package lab;

public class Human {
    private String name;
    private String surName;
    private double money;

    public Human() {

    }

    public Human(String name, String surName, double money) {
        setName(name);
        setSurName(surName);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
