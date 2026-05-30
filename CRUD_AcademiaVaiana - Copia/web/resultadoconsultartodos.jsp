<%-- 
    Document   : resultadoconsultartodos
    Created on : 29 de mai. de 2026, 21:06:37
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="model.Aluno"%>

<!DOCTYPE html>
<html>

    <head>
        <title>Lista de Alunos</title>
    </head>

    <body>

        <jsp:include page="components/header.jsp"/>

    <center>

        <h2>Todos os Alunos</h2>

        <%
            List<Aluno> lista
                    = (List<Aluno>) request.getAttribute("laluno");

            if (lista == null || lista.isEmpty()) {
        %>

        <h3>Nenhum aluno cadastrado.</h3>

        <a href="cadastroAluno.jsp">
            Cadastrar Primeiro Aluno
        </a>

        <%
        } else {
        %>

        <h3>
            Total de alunos cadastrados:
            <%= lista.size()%>
        </h3>

        <table border="1" cellpadding="8">

            <tr>
                <th>Matrícula</th>
                <th>Nome</th>
                <th>Objetivo</th>
                <th>Atualizar</th>
                <th>Excluir</th>
            </tr>

            <%
                for (Aluno aluno : lista) {
            %>

            <tr>

                <td><%= aluno.getMatricula()%></td>

                <td><%= aluno.getNome()%></td>

                <td><%= aluno.getObjetivo()%></td>

                <td>

                    <form action="controle_aluno" method="post">

                        <input type="hidden"
                               name="txtmatricula"
                               value="<%= aluno.getMatricula()%>">

                        <input type="hidden"
                               name="op"
                               value="ATUALIZAR">

                        <button type="submit">
                            ✏ Atualizar
                        </button>

                    </form>

                </td>

                <td>

                    <form action="confirmarExclusao.jsp" method="post">

                        <input type="hidden"
                               name="matricula"
                               value="<%= aluno.getMatricula()%>">

                        <input type="hidden"
                               name="nome"
                               value="<%= aluno.getNome()%>">

                        <input type="hidden"
                               name="cpf"
                               value="<%= aluno.getCpf()%>">

                        <button type="submit">
                            🗑 Excluir
                        </button>

                    </form>

                </td>

            </tr>

            <%
                }
            %>

        </table>

        <%
            }
        %>

        <br><br>

        <a href="index.jsp">
            🏠 Home
        </a>

    </center>

    <jsp:include page="components/footer.jsp"/>

</body>
</html>