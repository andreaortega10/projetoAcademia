<%-- 
    Document   : resultadoconsultarbyid
    Created on : 29 de mai. de 2026, 21:07:17
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Aluno"%>

<!DOCTYPE html>
<html>

    <head>
        <title>Consulta de Aluno</title>
    </head>

    <body>

        <jsp:include page="components/header.jsp"/>

    <center>

        <h2>Resultado da Consulta</h2>

        <%
            Aluno a = (Aluno) request.getAttribute("a");

            if (a == null) {
        %>

        <h3>Nenhum aluno encontrado.</h3>

        <%
        } else {
        %>

        <table border="1" cellpadding="8">

            <tr>
                <td>Matrícula</td>
                <td><%= a.getMatricula()%></td>
            </tr>

            <tr>
                <td>Nome</td>
                <td><%= a.getNome()%></td>
            </tr>

            <tr>
                <td>CPF</td>
                <td><%= a.getCpf()%></td>
            </tr>

            <tr>
                <td>Gênero</td>
                <td><%= a.getGenero()%></td>
            </tr>

            <tr>
                <td>Nascimento</td>
                <td><%= a.getDtNascimento()%></td>
            </tr>

            <tr>
                <td>Objetivo</td>
                <td><%= a.getObjetivo()%></td>
            </tr>

            <tr>
                <td>Limitação</td>
                <td><%= a.getLimitacao()%></td>
            </tr>

        </table>

        <br>

        <form action="controle_aluno" method="post">

            <input type="hidden"
                   name="txtmatricula"
                   value="<%= a.getMatricula()%>">

            <input type="hidden"
                   name="op"
                   value="ATUALIZAR">

            <button type="submit">
                ✏ Atualizar
            </button>

        </form>

        <%
            }
        %>

        <br><br>

        <a href="consultarAluno.jsp">
            ⬅ Voltar
        </a>

        <br><br>

        <a href="index.jsp">
            🏠 Home
        </a>

    </center>

    <jsp:include page="components/footer.jsp"/>

</body>
</html>