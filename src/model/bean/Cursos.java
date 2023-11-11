/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Cursos {
    private int id_Curso;
    private String nome_Curso;
    private String area;

    public Cursos() {
    }

    public Cursos(int id_Curso, String nome_Curso, String area) {
        this.id_Curso = id_Curso;
        this.nome_Curso = nome_Curso;
        this.area = area;
    }

    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String getNome_Curso() {
        return nome_Curso;
    }

    public void setNome_Curso(String nome_Curso) {
        this.nome_Curso = nome_Curso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
