package com.isaackennedy.projectadministrator.repository;

import com.isaackennedy.projectadministrator.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Transactional(readOnly = true)
    Usuario findByEmail(String email);
}
