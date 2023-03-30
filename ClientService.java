package com.example.SDIApp.Service;


import com.example.SDIApp.Repositoriy.ClientRepository;
import com.example.SDIApp.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    /*
    @Autowired
    public ClientService(@Qualifier("m") ClientInMemoryRepoInterface repo)
    {
        this.inMemoryRepo = repo;
        //inMemoryRepo.populate();
    }
     */

//    public ClientService(ClientRepository inMemoryRepo) {
//        this.clientRepository = inMemoryRepo;
//    }

    public Client addService(Client new_Client)
    {
        return clientRepository.save(new_Client);
    }

    public List<Client> addClientsListService(List<Client> Clients)
    {
        return clientRepository.saveAll(Clients);
    }

    public List<Client> getClientsService()
    {
        return clientRepository.findAll();
    }

    public Optional<Client> getService(Integer id) { return clientRepository.findById(id); }

    public void deleteService(Integer id) { clientRepository.deleteById(id); }
//    public Client updateService(Integer id, Client new_Client)
//    {
//        Client Client = clientRepository.findById(id).orElse(null);
//
//        Client.setAge(new_Client.getAge());
//        Client.setEmail(new_Client.getEmail());
//        Client.setGender(new_Client.getGender());
//        Client.setClientName(new_Client.getClientName());
//
//        return clientRepository.save(Client);
//    }
}
