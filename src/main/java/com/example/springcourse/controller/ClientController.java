package com.example.springcourse.controller;

import com.example.springcourse.models.Client;
import com.example.springcourse.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping(value = "/getClients")
    public ResponseEntity getClients(){

        Iterable<Client> clients = service.returnClientes();

        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping(value = "/searchByLastName")
    public ResponseEntity searchByLastName(@RequestParam( value = "name") String name){
        Client client = service.searchByName(name);
        return new ResponseEntity<>(client,HttpStatus.OK);
    }

    @GetMapping(value = "/createClient")
    public ResponseEntity createClient (@RequestBody Client client){
        Client clientCreated = service.createClient(client);
        return new ResponseEntity<>(clientCreated, HttpStatus.OK);
    }

    @GetMapping(value = "/findById")
    public ResponseEntity findById(Long id){
        Client clientFound = service.searchByID(id);
        return new ResponseEntity<>(clientFound, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById")
    public ResponseEntity deleteById(@RequestParam (value = "id") Long id){
        boolean deleted = service.deleteById(id);
        return new ResponseEntity<>( deleted,HttpStatus.OK);
    }


}
