package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers")
public class OrderReceipt {

    @Id
    private int id;
    private String name;
    private float cost;

    public OrderReceipt(){}

    public OrderReceipt(int id, String name, float cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
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
