package com.example.SDIApp.Service;

import com.example.SDIApp.Repositoriy.TransactionRepository;
import com.example.SDIApp.Model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;

    public Transaction addService(Transaction new_transaction) { return repository.save(new_transaction); }

    public List<Transaction> addTransactionsListService(Set<Transaction> transactionSet)
    {
        return repository.saveAll(transactionSet); // the set becomes a List<Transaction>
    }

    public List<Transaction> getTransactionsService() { return repository.findAll(); }

    public Optional<Transaction> getService(Integer id) { return repository.findById(id); }

    public void deleteService(Integer id) { repository.deleteById(id); }
}
