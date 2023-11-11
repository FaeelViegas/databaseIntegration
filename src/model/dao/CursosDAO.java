/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cursos;

/**
 *
 * @author Senai
 */
public class CursosDAO {

    public List<Cursos> read() {
        List<Cursos> cursos = new ArrayList<>();

        try {
            Connection conexao = Conexao.connect();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("SELECT * FROM CURSOS");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cursos curso = new Cursos();
                curso.setId_Curso(rs.getInt("ID_CURSO"));
                curso.setNome_Curso(rs.getString("NOME_CURSO"));
                curso.setArea(rs.getString("AREA"));
                cursos.add(curso);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
    }

    public void cadastrarCurso(Cursos objCurso) {
        try {
            Connection conexao = Conexao.connect();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("insert into cursos(NOME_CURSO,AREA)values(?,?)");
            stmt.setString(1, objCurso.getNome_Curso());
            stmt.setString(2, objCurso.getArea());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Curso inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarCompos(Cursos objCurso) {
        try {
            Connection conexao = Conexao.connect();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("update cursos  set NOME_CURSO = ?, AREA = ? where ID_CURSO = ?");
            stmt.setString(1, objCurso.getNome_Curso());
            stmt.setString(2, objCurso.getArea());
            stmt.setInt(3, objCurso.getId_Curso());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCampo(Cursos objCurso) {
        try{
            Connection conexao = Conexao.connect();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("DELETE FROM cursos WHERE ID_CURSO = ?");
            stmt.setInt(1, objCurso.getId_Curso());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
