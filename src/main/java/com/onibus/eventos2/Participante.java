package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "participantes")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @ManyToMany
    @JoinTable(name = "participante_evento",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    private Set<evento> eventos;
   @OneToMany (mappedBy = "participante")
    private Set<Ingresso> ingressos;

}
