package com.academia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos", schema = "academia")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 150)
    private String apellidos;

    @Column(name = "curso", nullable = false, length = 50)
    private String curso;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "num_asignaturas", nullable = false)
    private Integer numAsignaturas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(Integer numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id:" + id +
                ", nombre:'" + nombre + '\'' +
                ", apellidos:'" + apellidos + '\'' +
                ", curso:'" + curso + '\'' +
                ", edad:" + edad +
                ", numAsignaturas:" + numAsignaturas +
                '}';
    }
}