package com.dio.santander.banklineapi.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_movimentacao")
@Data
public class Movimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data_hora")
    private LocalDateTime dataHora;
    private String descicao;
    private Double valor;
    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo movimentacaoTipo;
}
