package logic.components;

public class Ore {
    private String name;
    private int cost;

    public Ore(String name, int cost) {
        this.name = name;
        if(cost < 1) cost = 1;
        this.cost = cost;
    }

    public boolean equals(Object o) {
        Ore tmp = (Ore) o;
        return (this.name.equals(tmp.name)) && (this.cost == tmp.cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost < 1) cost = 1;
        this.cost = cost;
    }
}
