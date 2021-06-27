package com.isaackennedy.projectadministrator.domain;

import com.isaackennedy.projectadministrator.domain.enums.TipoUsuario;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String email;

    @Column
    private String nome;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="TIPOS")
    private Set<Integer> tiposUsuario = new HashSet<>();

    @Column
    private String senha;

    public void addTipo(TipoUsuario tipo) {
        tiposUsuario.add(tipo.getCod());
    }

    public Set<TipoUsuario> getTipos() {
        return this.tiposUsuario.stream().map(TipoUsuario::toEnum).collect(Collectors.toSet());
    }

}
