package com.github.guilhermeleme.citiesapi.states.repository;

import com.github.guilhermeleme.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
