package logic.components;

import java.lang.String;

public class Food {
    private String name;
    private int price;
    private int energy;

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

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if(energy < 1) energy = 1;
        this.energy = energy;
    }

    public Food(String name, int price, int energy) {
        this.name = name;
        if(price < 1) price = 1;
        this.setPrice(price);
        if(energy < 1) energy = 1;
        this.setEnergy(energy);
    }

    public boolean equals(Object o) {
        Food f = (Food) o;
        return (this.price == f.price) && (this.energy == f.energy) && (this.name.equals(f.name));
    }
}
