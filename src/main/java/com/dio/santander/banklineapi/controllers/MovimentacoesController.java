package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.model.dto.MovimentacaoDTO;
import com.dio.santander.banklineapi.model.entities.Movimentacao;
import com.dio.santander.banklineapi.model.repositories.MovimentacoesRepository;
import com.dio.santander.banklineapi.services.CorrentistaService;
import com.dio.santander.banklineapi.services.NovaMovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacoesController {

    @Autowired
    private MovimentacoesRepository movimentacoesRepository;

    @Autowired
    NovaMovimentacaoService movimentacaoService;

    @GetMapping
    public List<Movimentacao> findAll() {
        return movimentacoesRepository.findAll();
    }

    @PostMapping()
    public void registrarMovimentacoes(@RequestBody MovimentacaoDTO movimentacao){
        movimentacaoService.save(movimentacao);
    }
}
