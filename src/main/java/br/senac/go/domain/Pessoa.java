package br.senac.go.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class Pessoa extends BaseModel {
    private Integer id;
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private List<Contato> contatos;
}
