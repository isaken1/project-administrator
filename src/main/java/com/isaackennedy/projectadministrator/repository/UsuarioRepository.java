package com.isaackennedy.projectadministrator.repository;

import com.isaackennedy.projectadministrator.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {}
