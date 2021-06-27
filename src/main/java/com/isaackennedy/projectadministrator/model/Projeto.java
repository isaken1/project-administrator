package com.isaackennedy.projectadministrator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nome;

}
