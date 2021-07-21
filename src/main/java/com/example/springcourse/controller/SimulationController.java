package com.example.springcourse.controller;

import com.example.springcourse.models.DataSimulation;
import com.example.springcourse.service.SimulationService;
import com.example.springcourse.util.formula.Formula;
import com.example.springcourse.util.formula.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class SimulationController {

    @Autowired
    SimulationService service;

     @GetMapping(value = "/generate-simalation")
    public ResponseEntity generateSimulation(@Valid @RequestBody DataSimulation dataSimulation){

         ArrayList<Month> tableMonth = Formula.generateSimulation(dataSimulation);
         service.saveDataSimulation(dataSimulation);

         return new ResponseEntity(tableMonth,HttpStatus.OK);
     }
}
