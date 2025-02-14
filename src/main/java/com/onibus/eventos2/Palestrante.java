package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "palestrantes")
public class Palestrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String bio;
    @OneToMany (mappedBy = "palestrante")
    private Set<Atividade> atividades;

}
