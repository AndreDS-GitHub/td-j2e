<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Catalogue - Backoffice</title>
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
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="<% request.getContextPath(); %>/backoffice/produit">Ajouter produit<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<% request.getContextPath(); %>/backoffice/deconnexion">Deconnexion<span class="sr-only">(current)</span></a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container" style="margin-top: 20px">
        <div class="row">
            <c:forEach items="${produits}" var="produit" varStatus="status">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="http://www.stonyelectrical.com/wp-content/uploads/2018/04/Product_Icon-300x300.png" width="250" height="250" alt="<c:out value="${ produit.getNom() }"/>">
                    <div class="card-body">
                        <h5 class="card-title"><c:out value="${ produit.getNom() }"/></h5>
                        <h4 class="card-title" style="color: red"><c:out value="${ produit.getPrix() }"/> €</h4>
                        <p class="card-text"><c:out value="${ produit.getDescription() }"/></p>
                        <a href="<% request.getContextPath(); %>/backoffice/produit?name=<c:out value="${ produit.getNom() }"/>" class="btn btn-primary">Modifier</a>
                        <a href="<% request.getContextPath(); %>/backoffice/produit?name=<c:out value="${ produit.getNom() }"/>&delete=true" class="btn btn-primary">Delete</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

<%--    <c:forEach items="${produits}" var="produit" varStatus="status">--%>
<%--        <p><c:out value="${ produit.getNom() }"/></p>--%>
<%--    </c:forEach>--%>
</body>
</html>
