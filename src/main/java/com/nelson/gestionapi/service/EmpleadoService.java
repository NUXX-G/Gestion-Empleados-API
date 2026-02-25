package com.nelson.gestionapi.service;

import com.nelson.gestionapi.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmpleadoService
{
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public void listarEmpleados()
    {
        
    }
}
