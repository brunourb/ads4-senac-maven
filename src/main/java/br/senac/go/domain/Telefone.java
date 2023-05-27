package br.senac.go.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "telefone")
public class Telefone extends BaseModel {
    private String ddd;
    private String numero;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    //private Contato contato;
}
