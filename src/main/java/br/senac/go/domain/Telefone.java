package br.senac.go.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Telefone extends BaseModel {
    private String ddd;
    private String numero;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;
}
