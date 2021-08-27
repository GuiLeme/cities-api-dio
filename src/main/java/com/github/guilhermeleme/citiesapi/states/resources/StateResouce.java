package com.github.guilhermeleme.citiesapi.states.resources;

import com.github.guilhermeleme.citiesapi.states.entities.State;
import com.github.guilhermeleme.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResouce {

    private final StateRepository repository;

    @Autowired
    public StateResouce(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states(){
        return repository.findAll();
    }
}
