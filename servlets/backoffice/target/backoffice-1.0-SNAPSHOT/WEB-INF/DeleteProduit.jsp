<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete produit</title>
    <%--  Bootstrap  --%>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"
            integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o"
            crossorigin="anonymous"></script>
</head>
<body>

<%--  MENU --%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="<% request.getContextPath(); %>/backoffice/catalogue">Catalogue</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="<% request.getContextPath(); %>/backoffice/produit"><span
                        class="sr-only">(current)</span></a>
            </li>
        </ul>
    </div>
</nav>

<%-- FORM --%>
<form method="delete" action="<% request.getContextPath(); %>/backoffice/produit">
    <div class="form-group">
        <label for="nameNewProduit">Nom</label>
        <input type="text" class="form-control" name="name" id="nameNewProduit" placeholder="Saisir le nom ici..."
               value="<c:out value="${ produit.getNom() }"/>" readonly>
    </div>
    <div class="form-group">
        <label for="descNewProduit">Description</label>
        <input type="text" class="form-control" name="description" id="descNewProduit"
               placeholder="Saisir la description ici..." value="<c:out value="${ produit.getDescription() }"/>" readonly>
    </div>
    <div class="form-group">
        <label for="priceNewProduit">Prix</label>
        <input type="number" step="0.01" class="form-control" name="price" id="priceNewProduit"
               placeholder="Saisir le prix ici..." value="<c:out value="${ produit.getPrix() }"/>" readonly>
    </div>
    <button type="submit" name="deleteButton" class="btn btn-primary">Delete</button>
</form>

</body>
</html>
