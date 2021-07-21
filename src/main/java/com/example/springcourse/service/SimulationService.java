package com.example.springcourse.service;

import com.example.springcourse.models.DataSimulation;
import com.example.springcourse.repository.ISimulationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimulationService implements  ISimalationService{

    @Autowired
    ISimulationRespository respository;

    @Override
    public void saveDataSimulation(DataSimulation data) {
        respository.save(data);
    }
}
