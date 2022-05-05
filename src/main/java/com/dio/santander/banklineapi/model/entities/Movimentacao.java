package com.dio.santander.banklineapi.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_movimentacao")
@Data
public class Movimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data_hora")
    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;
    @Column(name = "id_conta")
    private Integer idConta;
    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo movimentacaoTipo;
}
