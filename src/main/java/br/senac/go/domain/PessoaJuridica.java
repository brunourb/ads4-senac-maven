package br.senac.go.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends BaseModel {

    private String cnpj;
}
