package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "organizadores")
public class organizador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @OneToMany (mappedBy = "organizador")
    private Set<evento> eventos;
}
