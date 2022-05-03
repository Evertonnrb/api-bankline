package com.dio.santander.banklineapi.model.dto;

import com.dio.santander.banklineapi.model.entities.MovimentacaoTipo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;


@Getter
@Setter
public class MovimentacaoDTO {
    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;
}
