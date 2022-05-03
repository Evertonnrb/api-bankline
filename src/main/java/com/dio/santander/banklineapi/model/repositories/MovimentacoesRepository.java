package com.dio.santander.banklineapi.model.repositories;

import com.dio.santander.banklineapi.model.entities.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacoesRepository extends JpaRepository<Movimentacao, Integer> {
}
