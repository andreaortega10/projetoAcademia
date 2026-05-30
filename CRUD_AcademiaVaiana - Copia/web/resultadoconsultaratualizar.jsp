<%-- 
    Document   : resultadoconsultaratualizar
    Created on : 29 de mai. de 2026, 21:09:13
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.Aluno" %>


<!DOCTYPE html>

<html>

    <head>
        <title>Atualizar Aluno</title>
    </head>

    <body>

        <%
            Aluno a = (Aluno) request.getAttribute("a");
        %>
        <jsp:include page="components/header.jsp"/>

    <center>

        <h2>Atualização de Aluno</h2>

        <form action="controle_aluno"
              method="post">

            <input type="hidden"
                   name="op"
                   value="EFETIVAR ATUALIZAÇÃO">

            <table border="1" cellpadding="8">

                <tr>
                    <td>Matrícula</td>
                    <td>
                        <input type="text"
                               name="txtmatricula"
                               value="<%= a.getMatricula() %>"
                               readonly>
                    </td>
                </tr>

                <tr>
                    <td>Nome</td>
                    <td>
                        <input type="text"
                               name="txtnome"
                               value="<%= a.getNome() %>"
                               required>
                    </td>
                </tr>

                <tr>
                    <td>CPF</td>
                    <td>
                        <input type="text"
                               name="txtcpf"
                               value="<%= a.getCpf() %>"
                               required>
                    </td>
                </tr>

                <tr>
                    <td>Gênero</td>
                    <td>

                        <select name="txtgenero">

                            <option value="<%= a.getGenero() %>">
                                <%= a.getGenero() %>
                            </option>

                            <option value="Feminino">
                                Feminino
                            </option>

                            <option value="Masculino">
                                Masculino
                            </option>

                            <option value="Não informar">
                                Não informar
                            </option>

                        </select>

                    </td>
                </tr>

                <tr>
                    <td>Data Nascimento</td>
                    <td>

                        <input type="date"
                               name="txtdtnascimento"
                               value="<%= a.getDtNascimento() %>"
                               required>

                    </td>
                </tr>

                <tr>
                    <td>Endereço</td>
                    <td>

                        <input type="text"
                               name="txtendereco"
                               value="<%= a.getEndereco() %>">

                    </td>
                </tr>

                <tr>
                    <td>Email</td>
                    <td>

                        <input type="email"
                               name="txtemail"
                               value="<%= a.getEmail() %>">

                    </td>
                </tr>

                <tr>
                    <td>Celular</td>
                    <td>

                        <input type="text"
                               name="txtcelular"
                               value="<%= a.getCelular() %>">

                    </td>
                </tr>

                <tr>
                    <td>Objetivo</td>
                    <td>

                        <input type="text"
                               name="txtobjetivo"
                               value="<%= a.getObjetivo() %>"
                               required>

                    </td>
                </tr>

                <tr>
                    <td>Limitação</td>
                    <td>

                        <input type="text"
                               name="txtlimitacao"
                               value="<%= a.getLimitacao() %>">

                    </td>
                </tr>

            </table>

            <br>

            <button type="submit">

                💾 Salvar Alterações

            </button>

        </form>

        <br>

        <a href="index.jsp">

            🏠 Home

        </a>

    </center>

    <jsp:include page="components/footer.jsp"/>

</body>

</html>
