package com.br.springuera.demonstracao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="caracteristica_personagem")
public class PersonagemCaracteristica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private PersonagemAtributo atributo;

    private enum valor {
        BONUS,
        FRAQUEZA
    };


}
