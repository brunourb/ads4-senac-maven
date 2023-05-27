package br.senac.go.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "contato")
public class Contato extends BaseModel {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    //Relacionamento Bi-direcional
    /**
     * Sugestão é sempre LAZY (forma preguiçosa de fazer a consulta).
     * A consulta é realizada somente quando a propriedade é 'invocada'.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa pessoa;
    /**
     * A configuração @OneToMany por padrão o fetch é sempre LAZY
     */
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Email> emails;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefone> telefones;
}
