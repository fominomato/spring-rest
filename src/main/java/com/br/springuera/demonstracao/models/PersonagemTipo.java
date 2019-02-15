package com.br.springuera.demonstracao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="personagem_tipo")
public class PersonagemTipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private PersonagemCaracteristica fraqueza;

    private PersonagemCaracteristica bonus;

}
