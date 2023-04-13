package br.senac.go.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Email extends BaseModel{
    private String enderecoEmail;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;
}
