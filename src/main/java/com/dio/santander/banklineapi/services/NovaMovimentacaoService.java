package com.dio.santander.banklineapi.services;

import com.dio.santander.banklineapi.model.dto.MovimentacaoDTO;
import com.dio.santander.banklineapi.model.entities.Correntista;
import com.dio.santander.banklineapi.model.entities.Movimentacao;
import com.dio.santander.banklineapi.model.entities.MovimentacaoTipo;
import com.dio.santander.banklineapi.model.repositories.CorrentistaRepository;
import com.dio.santander.banklineapi.model.repositories.MovimentacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class NovaMovimentacaoService {
    @Autowired
    private MovimentacoesRepository movimentacoesRepository;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(MovimentacaoDTO movimentacaoDTO) {
        Movimentacao movimentacao = new Movimentacao();

        Double valor =
                movimentacaoDTO.getTipo() == MovimentacaoTipo.RECEITA ?
                        movimentacaoDTO.getValor() : movimentacaoDTO.getValor() * -1;

        Correntista correntista = correntistaRepository.findById(movimentacaoDTO.getIdConta()).orElse(null);

        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(movimentacaoDTO.getDescricao());
        movimentacao.setIdConta(movimentacaoDTO.getIdConta());
        movimentacao.setMovimentacaoTipo(movimentacaoDTO.getTipo());

        movimentacao.setValor(valor);
        if (correntista != null) {
            correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
            correntistaRepository.save(correntista);
        }
        movimentacoesRepository.save(movimentacao);
    }
}
