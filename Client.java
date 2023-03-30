package com.example.SDIApp.Model;


/*
{
    "clientName" : "Ion",
    "phone" : "0712345678",
    "gender" : "male",
    "email" : "ion47363@mail.com",
    "age" : 25
}
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import java.util.List;



@Entity
@AllArgsConstructor
@Table(name = "clients")// This tells Hibernate to make a table out of this class
// Hibernate automatically translates the entity into a table.
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer clientID;

    private String clientName;

    private String phone;

    private String gender;

    private String email;

    private int age;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "clientID")
    private List<Product> products;

    public Client()
    {}

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
       this.products = products;
    }

    public Client(
            @JsonProperty("clientName") String clientName,
            @JsonProperty("phone") String phone,
            @JsonProperty("gender") String gender,
            @JsonProperty("email") String email,
            @JsonProperty("age") int age)
            //JsonProperty("products") List<Product> product)
     {
        this.clientID = null;
        this.clientName = clientName;
        this.phone= phone;
        this.gender = gender;
        this.email = email;
        this.age = age;
        //this.products = product;
    }




    //     setters

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //       getters

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Integer getClientID() {
        return clientID;
    }
}
