package com.isaackennedy.projectadministrator.domain;

import com.isaackennedy.projectadministrator.domain.enums.TipoUsuario;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    public boolean isAdmin() {
        return this.tipoUsuario.equals(TipoUsuario.ADMINISTRADOR);
    }

}
