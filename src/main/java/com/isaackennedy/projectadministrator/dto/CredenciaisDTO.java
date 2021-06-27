package com.isaackennedy.projectadministrator.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Getter
@Setter
public class CredenciaisDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "Preenchimento obrigatório!")
    private String email;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String senha;
}
