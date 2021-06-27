package com.isaackennedy.projectadministrator.service;

import com.isaackennedy.projectadministrator.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;
}
