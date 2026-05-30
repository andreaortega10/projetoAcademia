<%-- 
    Document   : confirmarExclusao
    Created on : 29 de mai. de 2026, 21:09:59
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>
        <title>Confirmar Exclusão</title>
    </head>

    <body>

        <jsp:include page="components/header.jsp"/>

    <center>

        <h2>Confirmar Exclusão</h2>

        <h3>

            Tem certeza que deseja excluir este aluno?

        </h3>

        <table border="1"
               cellpadding="8">

            <tr>
                <td>Matrícula</td>
                <td>
                    <%= request.getParameter("matricula")%>
                </td>
            </tr>

            <tr>
                <td>Nome</td>
                <td>
                    <%= request.getParameter("nome")%>
                </td>
            </tr>

            <tr>
                <td>CPF</td>
                <td>
                    <%= request.getParameter("cpf")%>
                </td>
            </tr>

        </table>

        <br>

        <form action="controle_aluno"
              method="post">

            <input type="hidden"
                   name="txtmatricula"
                   value="<%= request.getParameter("matricula")%>">

            <input type="hidden"
                   name="op"
                   value="DELETAR">

            <button type="submit">

                🗑 Confirmar Exclusão

            </button>

        </form>

        <br>

        <a href="javascript:history.back()">

            ⬅ Cancelar

        </a>

    </center>

    <jsp:include page="components/footer.jsp"/>

</body>

</html>