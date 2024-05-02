package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers")
public class RealFlowers {

    @Id
    private String name;
    private float cost;

    public RealFlowers(){}

    public RealFlowers(String name, float cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
