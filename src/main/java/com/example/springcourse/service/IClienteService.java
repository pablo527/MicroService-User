package com.example.springcourse.service;

import com.example.springcourse.models.Client;

public interface IClienteService {

    Iterable<Client> returnClientes();
    Client searchByName(String name);
    Client createClient(Client client);
    Client searchByID(Long id);
    Boolean deleteById(Long id);
}
