<%-- 
    Document   : erro
    Created on : 29 de mai. de 2026, 21:10:43
    Author     : deaor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Erro</title>
</head>

<body>

<jsp:include page="components/header.jsp"/>

<center>

<h2>Erro</h2>

<h3>

${message}

</h3>

<p>

Ocorreu um problema ao processar a operação.

</p>

<br>

<a href="index.jsp">

🏠 Voltar para Home

</a>

</center>

<jsp:include page="components/footer.jsp"/>

</body>

</html>
