package com.isaackennedy.projectadministrator.domain.enums;

public enum TipoUsuario {
    ADMINISTRADOR(0, "ROLE_ADMIN"), USUARIO(1, "ROLE_USUARIO");

    private int cod;
    private String descricao;

    TipoUsuario(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoUsuario toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (TipoUsuario x : TipoUsuario.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
