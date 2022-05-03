package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.model.dto.NovoCorrentistaDTO;
import com.dio.santander.banklineapi.model.entities.Correntista;
import com.dio.santander.banklineapi.model.repositories.CorrentistaRepository;
import com.dio.santander.banklineapi.services.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    CorrentistaRepository correntistaRepository;

    @Autowired
    CorrentistaService correntistaService;

    @GetMapping
    public List<Correntista> getCorrentistas(){
        return correntistaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentistaDTO correntista){
        correntistaService.save(correntista);
    }
}
