package com.example.SDIApp.Model;

/*
sa ruleze pe port 80
relatia 1 to many, cand se adauga un autor se asociaza bookurile    /author/id/books
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Transactions_Table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue
    private Integer transactionID;

    private int quantity;

    private boolean applied_discount_code;

    private String date;

    @ManyToOne
    @JoinColumn(name = "clientID")
    Client clients;

    @ManyToOne
    @JoinColumn(name = "productID")
    Product products;

    public boolean isApplied_discount_code() {
        return applied_discount_code;
    }

    public Client getClients() {
        return clients;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProducts() {
        return products;
    }

    public String getDate() {
        return date;
    }

    public void setApplied_discount_code(boolean applied_discount_code) {
        this.applied_discount_code = applied_discount_code;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
