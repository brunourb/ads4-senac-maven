package br.senac.go.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
public class Email extends BaseModel{
    private String enderecoEmail;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    //private Contato contato;
}
