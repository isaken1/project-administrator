package com.isaackennedy.projectadministrator.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class RegistroHora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Projeto projeto;
}
