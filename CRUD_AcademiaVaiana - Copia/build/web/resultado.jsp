<%-- 
    Document   : resultado
    Created on : 29 de mai. de 2026, 21:10:22
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Resultado</title>
</head>

<body>

<jsp:include page="components/header.jsp"/>

<center>

<h2>Resultado da Operação</h2>

<h3>

${message}

</h3>

<br>

<a href="index.jsp">

🏠 Voltar para Home

</a>

<br><br>

<a href="cadastroAluno.jsp">

👤 Cadastrar Novo Aluno

</a>

</center>

<jsp:include page="components/footer.jsp"/>

</body>

</html>