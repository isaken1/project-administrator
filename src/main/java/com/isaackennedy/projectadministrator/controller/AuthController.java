package com.isaackennedy.projectadministrator.controller;

import com.isaackennedy.projectadministrator.dto.EmailDTO;
import com.isaackennedy.projectadministrator.security.AuthUser;
import com.isaackennedy.projectadministrator.security.JWTUtil;
import com.isaackennedy.projectadministrator.service.AuthService;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/refresh_token")
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        AuthUser user = AuthService.authenticated();
        String token = jwtUtil.generateToken(user.getUsername());
        response.addHeader("Authorization", "Bearer " + token);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/forgot")
    public ResponseEntity<String> forgot(@Valid @RequestBody EmailDTO objDTO) throws ObjectNotFoundException {
        String pass = authService.sendNewPassword(objDTO.getEmail());
        return ResponseEntity.ok(pass);
    }

}
