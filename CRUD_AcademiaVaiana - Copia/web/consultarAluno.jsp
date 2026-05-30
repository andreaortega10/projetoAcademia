<%-- 
    Document   : consultarAluno
    Created on : 29 de mai. de 2026, 21:05:12
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Consultar Aluno</title>
</head>

<body>

<jsp:include page="components/header.jsp"/>

<center>

<h2>Consultar Aluno</h2>

<form action="controle_aluno"
      method="post">

<table border="1"
       cellpadding="8">

<tr>

<td>

Matrícula

</td>

<td>

<input type="number"
       name="txtmatricula"
       required>

</td>

</tr>

</table>

<br>

<input type="hidden"
       name="op"
       value="CONSULTAR BY ID">

<button type="submit">

Pesquisar

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
