<%-- 
    Document   : cadastroAluno
    Created on : 29 de mai. de 2026, 21:04:47
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Cadastrar Aluno</title>
</head>

<body>

<jsp:include page="components/header.jsp"/>

<center>

<h2>Cadastro de Aluno</h2>

<form action="controle_aluno"
      method="post">

<input type="hidden"
       name="op"
       value="CADASTRAR">

<table border="1" cellpadding="8">

<tr>
    <td>Nome *</td>
    <td>
        <input type="text"
               name="txtnome"
               required>
    </td>
</tr>

<tr>
    <td>CPF *</td>
    <td>
        <input type="text"
               name="txtcpf"
               required>
    </td>
</tr>

<tr>
    <td>Gênero</td>
    <td>

        <select name="txtgenero">

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
    <td>Data Nascimento *</td>
    <td>

        <input type="date"
               name="txtdtnascimento"
               required>

    </td>
</tr>

<tr>
    <td>Endereço</td>
    <td>

        <input type="text"
               name="txtendereco">

    </td>
</tr>

<tr>
    <td>Email</td>
    <td>

        <input type="email"
               name="txtemail">

    </td>
</tr>

<tr>
    <td>Celular</td>
    <td>

        <input type="text"
               name="txtcelular">

    </td>
</tr>

<tr>
    <td>Objetivo *</td>
    <td>

        <input type="text"
               name="txtobjetivo"
               required>

    </td>
</tr>

<tr>
    <td>Limitação</td>
    <td>

        <input type="text"
               name="txtlimitacao">

    </td>
</tr>

</table>

<br>

* Campo obrigatório

<br><br>

<button type="submit">

    Concluir Cadastro

</button>

</form>

<br>

<a href="index.jsp">

⬅ Voltar

</a>

</center>

<jsp:include page="components/footer.jsp"/>

</body>

</html>