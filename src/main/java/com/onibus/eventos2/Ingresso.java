package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "ingressos")
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private Long preco;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private evento evento;
    @OneToMany (mappedBy = "ingresso")
    private Set<Participante> participantes;

}
