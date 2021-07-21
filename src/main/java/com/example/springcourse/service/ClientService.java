package com.example.springcourse.service;

import com.example.springcourse.models.Client;
import com.example.springcourse.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClienteService {
    @Autowired
    private IClientRepository repository;

    @Override
    public Iterable<Client> returnClientes() {
        return repository.findAll();
    }

    @Override
    public Client searchByName(String name) {
        return repository.searchByName(name);
    }

    @Override
    public Client createClient(Client client) {
        client = repository.save(client);
        return client;
    }

    @Override
    public Client searchByID(Long id) {
        return repository.searchById(id);
    }

    @Override
    public Boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }
}
