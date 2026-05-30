<%-- 
    Document   : index
    Created on : 29 de mai. de 2026, 21:04:07
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Sistema Academia</title>
</head>

<body>

<jsp:include page="components/header.jsp"/>

<center>

<h2>MENU PRINCIPAL</h2>

<br>

<table border="1" cellpadding="20">

    <tr>

        <td align="center">

            <a href="cadastroAluno.jsp">

                👤

                <br><br>

                Cadastrar Aluno

            </a>

        </td>

    </tr>

    <tr>

        <td align="center">

            <form action="controle_aluno"
                  method="post">

                <input type="hidden"
                       name="op"
                       value="CONSULTAR TODOS">

                <button type="submit">

                    📋 Consultar Todos os Alunos

                </button>

            </form>

        </td>

    </tr>

    <tr>

        <td align="center">

            <a href="consultarAluno.jsp">

                🔍

                <br><br>

                Consultar Aluno

            </a>

        </td>

    </tr>

</table>

</center>

<jsp:include page="components/footer.jsp"/>

</body>

</html>
