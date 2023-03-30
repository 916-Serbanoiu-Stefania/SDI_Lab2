package com.example.SDIApp.Repositoriy;

import com.example.SDIApp.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
