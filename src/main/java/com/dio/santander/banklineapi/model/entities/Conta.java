package com.dio.santander.banklineapi.model.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Conta {
    @Column(name = "conta_numero")
    private Long numero;
    @Column(name = "conta_saldo")
    private Double saldo;

}
