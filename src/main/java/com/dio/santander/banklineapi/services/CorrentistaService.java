package com.dio.santander.banklineapi.services;

import com.dio.santander.banklineapi.model.dto.NovoCorrentistaDTO;
import com.dio.santander.banklineapi.model.entities.Conta;
import com.dio.santander.banklineapi.model.entities.Correntista;
import com.dio.santander.banklineapi.model.repositories.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class CorrentistaService {

    @Autowired
    CorrentistaRepository correntistaRepository;

    public void save(NovoCorrentistaDTO novoCorrentista){
        Correntista correntista = new Correntista();
        correntista.setNome(novoCorrentista.getNome());
        correntista.setCpf(novoCorrentista.getCpf());
        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        correntista.setConta(conta);
        correntistaRepository.save(correntista);
    }
}
