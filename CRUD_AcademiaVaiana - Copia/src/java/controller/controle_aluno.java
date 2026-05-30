/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AlunoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.time.LocalDate;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Aluno;

/**
 *
 * @author deaor
 */
@WebServlet(name = "controle_aluno", urlPatterns = {"/controle_aluno"})
public class controle_aluno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String op = request.getParameter("op");

        if (op == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        AlunoDAO adao = new AlunoDAO();
        Aluno a = new Aluno();

        // =========================
        // CADASTRAR
        // =========================
        if (op.equals("CADASTRAR")) {

            String nome = request.getParameter("txtnome");
            String cpf = request.getParameter("txtcpf");
            String genero = request.getParameter("txtgenero");

            System.out.println("DATA RECEBIDA = " + request.getParameter("txtdtnascimento"));

            LocalDate dtNascimento = LocalDate.parse(
                    request.getParameter("txtdtnascimento")
            );

            String endereco = request.getParameter("txtendereco");
            String email = request.getParameter("txtemail");
            String celular = request.getParameter("txtcelular");
            String objetivo = request.getParameter("txtobjetivo");
            String limitacao = request.getParameter("txtlimitacao");

            a.setNome(nome);
            a.setCpf(cpf);
            a.setGenero(genero);
            a.setDtNascimento(dtNascimento);
            a.setEndereco(endereco);
            a.setEmail(email);
            a.setCelular(celular);
            a.setObjetivo(objetivo);
            a.setLimitacao(limitacao);

            try {

                adao.inserirAluno(a);

                request.setAttribute("message", "Aluno cadastrado com sucesso!");

                request.getRequestDispatcher("resultado.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());

                request.setAttribute("message", "Erro ao cadastrar aluno!");

                request.getRequestDispatcher("erro.jsp")
                        .forward(request, response);
            }

        } // =========================
        // DELETAR
        // =========================
        else if (op.equals("DELETAR")) {

            int matricula = Integer.parseInt(
                    request.getParameter("txtmatricula")
            );

            try {

                adao.deletarAluno(matricula);

                List<Aluno> laluno = adao.listarTodos();

                request.setAttribute("laluno", laluno);

                request.getRequestDispatcher("resultadoconsultartodos.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());

                request.getRequestDispatcher("erro.jsp")
                        .forward(request, response);
            }
        } // =========================
        // CONSULTAR BY ID
        // =========================
        else if (op.equals("CONSULTAR BY ID")) {

            int matricula = Integer.parseInt(
                    request.getParameter("txtmatricula")
            );

            try {

                a = adao.buscarAluno(matricula);

                request.setAttribute("a", a);

                request.getRequestDispatcher("resultadoconsultarbyid.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());
            }
        } // =========================
        // CONSULTAR TODOS
        // =========================
        else if (op.equals("CONSULTAR TODOS")) {

            try {

                List<Aluno> laluno = adao.listarTodos();

                request.setAttribute("laluno", laluno);

                request.getRequestDispatcher("resultadoconsultartodos.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());
            }
        } // =========================
        // ATUALIZAR
        // =========================
        else if (op.equals("ATUALIZAR")) {

            int matricula = Integer.parseInt(
                    request.getParameter("txtmatricula")
            );

            try {

                a = adao.buscarAluno(matricula);

                request.setAttribute("a", a);

                request.getRequestDispatcher("resultadoconsultaratualizar.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());
            }
        } // =========================
        // EFETIVAR ATUALIZAÇÃO
        // =========================
        else if (op.equals("EFETIVAR ATUALIZAÇÃO")) {

            int matricula = Integer.parseInt(
                    request.getParameter("txtmatricula")
            );

            String nome = request.getParameter("txtnome");
            String cpf = request.getParameter("txtcpf");
            String genero = request.getParameter("txtgenero");

            System.out.println("DATA RECEBIDA = " + request.getParameter("txtdtnascimento"));

            LocalDate dtNascimento = LocalDate.parse(
                    request.getParameter("txtdtnascimento")
            );

            String endereco = request.getParameter("txtendereco");
            String email = request.getParameter("txtemail");
            String celular = request.getParameter("txtcelular");
            String objetivo = request.getParameter("txtobjetivo");
            String limitacao = request.getParameter("txtlimitacao");

            a.setMatricula(matricula);
            a.setNome(nome);
            a.setCpf(cpf);
            a.setGenero(genero);
            a.setDtNascimento(dtNascimento);
            a.setEndereco(endereco);
            a.setEmail(email);
            a.setCelular(celular);
            a.setObjetivo(objetivo);
            a.setLimitacao(limitacao);

            try {

                adao.atualizarAluno(a);

                request.setAttribute("message", "Aluno atualizado com sucesso!");

                request.getRequestDispatcher("resultado.jsp")
                        .forward(request, response);

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());

                request.setAttribute("message", "Erro ao atualizar aluno!");

                request.getRequestDispatcher("erro.jsp")
                        .forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet Controller do sistema de academia";
    }
}
