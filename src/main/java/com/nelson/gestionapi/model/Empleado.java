package com.nelson.gestionapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String departamento;
    private double salario;

    public Empleado(String nombre, String apellido, String email, String departamento, double salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Empleado()
    {

    }

    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public String getDepartamento()
    {
        return departamento;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void  setDepartamento(String departamento)
    {
        this.departamento = departamento;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}
