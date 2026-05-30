/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author deaor
 */
public class Aluno {
    private int matricula;
    private String nome;
    private String cpf;
    private String genero;
    private LocalDate dtNascimento;
    private String endereco;
    private String email;
    private String celular;
    private String objetivo;
    private String limitacao;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String cpf, LocalDate dtNascimento, String objetivo, String limitacao){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.objetivo = objetivo;
        this.limitacao = limitacao;
    }
    
    public Aluno(String nome, String cpf, String genero, LocalDate dtNascimento, String endereco, String email, String celular, String objetivo, String limitacao){
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.objetivo = objetivo;
        this.limitacao = limitacao;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getLimitacao() {
        return limitacao;
    }

    public void setLimitacao(String limitacao) {
        this.limitacao = limitacao;
    }
    
    
    
}
