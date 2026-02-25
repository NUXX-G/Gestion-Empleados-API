package com.nelson.gestionapi.repository;

import com.nelson.gestionapi.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>
{

}
