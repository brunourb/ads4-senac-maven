package br.senac.go.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends BaseModel {
    private String cpf;
}