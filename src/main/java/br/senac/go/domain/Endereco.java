package br.senac.go.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Endereco extends BaseModel{
    private String logradouro;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;

}
