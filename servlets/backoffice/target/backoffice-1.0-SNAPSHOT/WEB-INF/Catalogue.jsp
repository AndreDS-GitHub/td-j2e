<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Catalogue - Backoffice</title>
</head>
<body>
Ceci est la page du catalogue

<c:forEach items="${produits}" var="produit" varStatus="status">
    <p><c:out value="${ produit.getNom() }"/></p>
</c:forEach>
</body>
</html>
