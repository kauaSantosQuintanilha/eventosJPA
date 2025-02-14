package com.onibus.eventos2;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "atividades")
public class Atividade {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "palestrante_id")
    private Palestrante palestrante;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private evento evento;

}
