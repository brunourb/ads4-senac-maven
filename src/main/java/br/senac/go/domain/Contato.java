package br.senac.go.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Contato extends BaseModel {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Pessoa pessoa;
    private List<Email> emails;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;
}
