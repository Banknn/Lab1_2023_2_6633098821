package logic.components;

public class Potion {
    private String name;
    private int price;
    private Status increasingStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 1) price = 1;
        this.price = price;
    }

    public Status getIncreasingStatus() {
        return increasingStatus;
    }

    public void setIncreasingStatus(Status increaingStatus) {
        this.increasingStatus = increaingStatus;
    }

    public Potion(String name, int price, Status increasingStatus) {
        this.setName(name);
        this.setPrice(price);
        this.setIncreasingStatus(increasingStatus);
    }

    public boolean equals(Object o) {
        Potion p = (Potion) o;
        return (this.name.equals(p.name)) && (this.price == p.price) && (this.increasingStatus.equals(p.increasingStatus));
    }
}
