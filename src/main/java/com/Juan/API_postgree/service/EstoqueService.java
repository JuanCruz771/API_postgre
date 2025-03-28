package com.Juan.API_postgree.service;

import com.Juan.API_postgree.models.Estoque;
import com.Juan.API_postgree.repositories.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository){
        this.estoqueRepository = estoqueRepository;

    }

    public Estoque addEstoque(Estoque estoque){

        return estoqueRepository.save(estoque);
    }

    public List<Estoque> getall(){

        return estoqueRepository.findAll();

    }

}
