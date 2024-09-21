package com.example.gameLibrary.repository;

import com.example.gameLibrary.model.JuegosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegosRepository extends CrudRepository<JuegosModel,Integer> {
}
