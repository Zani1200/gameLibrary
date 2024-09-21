package com.example.gameLibrary.service;

import com.example.gameLibrary.model.JuegosModel;
import com.example.gameLibrary.repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegosService {

    @Autowired
    JuegosRepository juegosRepository;

    public List<JuegosModel> findAll(){
        return (List<JuegosModel>) juegosRepository.findAll();
    }
}
