package com.example.SDIApp.Repositoriy;

import com.example.SDIApp.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}