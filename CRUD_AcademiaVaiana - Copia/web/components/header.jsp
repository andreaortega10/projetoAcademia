<%-- 
    Document   : header
    Created on : 29 de mai. de 2026, 20:57:27
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<table width="100%" border="1">
    <tr>
        <td align="center">
            <h1>Sistema Academia</h1>
            <h3>Sistema de Gerenciamento de Alunos</h3>

            <a href="index.jsp">🏠 Home</a>

            <br><br>

            Data:
            <%= java.time.LocalDate.now() %>
        </td>
    </tr>
</table>

<br>