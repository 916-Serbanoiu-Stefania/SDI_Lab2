package com.example.SDIApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor

@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productID;

    private String name;

    private int price;

    private int weight;

    private String materials;

    public Product() {}
    public Product (
            @JsonProperty("name")  String name,
            @JsonProperty("price") int price,
            @JsonProperty ("weight") int weight,
            @JsonProperty("materials") String materials
    )
    {
        this.price= price;
        this.materials = materials;
        this.weight = weight;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
