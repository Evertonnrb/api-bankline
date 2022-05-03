package com.dio.santander.banklineapi.model.repositories;

import com.dio.santander.banklineapi.model.entities.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista,Integer> {
}
