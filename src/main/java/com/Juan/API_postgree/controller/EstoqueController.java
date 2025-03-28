package com.Juan.API_postgree.controller;

import com.Juan.API_postgree.models.Estoque;
import com.Juan.API_postgree.service.EstoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService){

        this.estoqueService= estoqueService;
    }

    @GetMapping
    public List<Estoque> getall(){
        return estoqueService.getall();
    }

    @PostMapping
    public  Estoque addestoque(@RequestBody Estoque estoque){

        return estoqueService.addEstoque(estoque);

    }

}
