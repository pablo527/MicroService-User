package com.example.springcourse.repository;

import com.example.springcourse.models.DataSimulation;
import org.springframework.data.repository.CrudRepository;

public interface ISimulationRespository extends CrudRepository<DataSimulation,Long> {
}
