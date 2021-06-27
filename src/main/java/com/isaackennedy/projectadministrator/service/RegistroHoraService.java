package com.isaackennedy.projectadministrator.service;

import com.isaackennedy.projectadministrator.repository.RegistroHoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroHoraService {

    @Autowired
    private RegistroHoraRepository registroHora;
}
