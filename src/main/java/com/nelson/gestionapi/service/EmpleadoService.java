package com.nelson.gestionapi.service;

import com.nelson.gestionapi.model.Empleado;
import com.nelson.gestionapi.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EmpleadoService
{
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> listarEmpleados()
    {
        return empleadoRepository.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado)
    {
        return empleadoRepository.save(empleado);
    }

    public Empleado obtenerEmpleado(Long id)
    {
        return empleadoRepository.findById(id).orElseThrow();
    }

    public void eliminarEmpleado(Long id)
    {
        empleadoRepository.deleteById(id);
    }

    public Empleado actualizarEmpleado(Long id, Empleado empleado)
    {
        Empleado empleadoAct = obtenerEmpleado(id);
        empleadoAct.setApellido(empleado.getApellido());
        empleadoAct.setDepartamento(empleado.getDepartamento());
        empleadoAct.setEmail(empleado.getEmail());
        empleadoAct.setNombre(empleado.getNombre());
        empleadoAct.setSalario(empleado.getSalario());
        guardarEmpleado(empleadoAct);

        return empleadoAct;
    }
}
