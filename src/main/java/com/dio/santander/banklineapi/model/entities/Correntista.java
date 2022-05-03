package com.dio.santander.banklineapi.model.entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "tab_correntista")
@Data
public class Correntista {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cpf;
    private String nome;

    @Embedded
    private Conta conta;
}
