/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deaor
 */

public class AlunoDAO {

    private Connection con;

    // CONSTRUTOR
    public AlunoDAO() {
        util.Conexao conexao = new util.Conexao();
        con = conexao.conectar();
    }

    // INSERT
    public void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO aluno "
                + "(nome, cpf, genero, dtNascimento, endereco, email, celular, objetivo, limitacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getGenero());
            stmt.setDate(4, Date.valueOf(aluno.getDtNascimento()));
            stmt.setString(5, aluno.getEndereco());
            stmt.setString(6, aluno.getEmail());
            stmt.setString(7, aluno.getCelular());
            stmt.setString(8, aluno.getObjetivo());
            stmt.setString(9, aluno.getLimitacao());

            stmt.execute();
            stmt.close();

            System.out.println("Aluno inserido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir aluno: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizarAluno(Aluno aluno) {

        String sql = "UPDATE aluno SET "
                + "nome=?, "
                + "cpf=?, "
                + "genero=?, "
                + "dtNascimento=?, "
                + "endereco=?, "
                + "email=?, "
                + "celular=?, "
                + "objetivo=?, "
                + "limitacao=? "
                + "WHERE matricula=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getGenero());
            stmt.setDate(4,Date.valueOf(aluno.getDtNascimento()));
            stmt.setString(5, aluno.getEndereco());
            stmt.setString(6, aluno.getEmail());
            stmt.setString(7, aluno.getCelular());
            stmt.setString(8, aluno.getObjetivo());
            stmt.setString(9, aluno.getLimitacao());
            stmt.setInt(10, aluno.getMatricula());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Aluno atualizado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    // DELETE
    public void deletarAluno(int matricula) {
        String sql = "DELETE FROM aluno WHERE matricula=?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula);
            stmt.executeUpdate();
            stmt.close();

            System.out.println("Aluno deletado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar aluno: " + e.getMessage());
        }
    }

    // SELECT POR MATRÍCULA
    public Aluno buscarAluno(int matricula) {
        String sql = "SELECT * FROM aluno WHERE matricula=?";
        Aluno aluno = null;

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                aluno = new Aluno();

                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setGenero(rs.getString("genero"));
                aluno.setDtNascimento(rs.getDate("dtNascimento").toLocalDate());
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setObjetivo(rs.getString("objetivo"));
                aluno.setLimitacao(rs.getString("limitacao"));
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro ao buscar aluno: " + e.getMessage());
        }

        return aluno;
    }

    // SELECT TODOS
    public List<Aluno> listarTodos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setGenero(rs.getString("genero"));
                aluno.setDtNascimento(rs.getDate("dtNascimento").toLocalDate());
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setObjetivo(rs.getString("objetivo"));
                aluno.setLimitacao(rs.getString("limitacao"));

                
                System.out.println("MATRICULA: " + aluno.getMatricula());
                System.out.println("NOME: " + aluno.getNome());
                System.out.println("OBJETIVO: " + aluno.getObjetivo());
                System.out.println("-------------------");
                lista.add(aluno);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }

        return lista;
    }
}
