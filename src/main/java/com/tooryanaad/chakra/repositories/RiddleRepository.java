package com.tooryanaad.chakra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tooryanaad.chakra.model.Riddles;

@Repository
public interface RiddleRepository extends JpaRepository<Riddles, Integer> {

}
