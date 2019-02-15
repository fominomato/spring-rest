package com.br.springuera.demonstracao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="atributo_personagem")
public class PersonagemAtributo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
}
