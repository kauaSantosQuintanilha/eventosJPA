package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "eventos")
public class evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    @OneToMany (mappedBy = "evento")
    private Set<Ingresso> ingressos;
    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private organizador organizador;
    @ManyToMany(mappedBy = "eventos")
    private Set<Palestrante> palestrantes;
    @OneToMany (mappedBy = "evento")
    private Set<Atividade> atividades;
    @ManyToMany(mappedBy = "eventos")
    private Set<Participante> participantes;




}
