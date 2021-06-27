package com.isaackennedy.projectadministrator.service;

import com.isaackennedy.projectadministrator.repository.UsuarioRepository;
import com.isaackennedy.projectadministrator.security.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var usuario = usuarioRepository.findByEmail(email);

        if (usuario == null) {
            throw new UsernameNotFoundException(email);
        }

        return new AuthUser(usuario.getId(), usuario.getEmail(), usuario.getSenha(), usuario.getTipos());
    }
}
