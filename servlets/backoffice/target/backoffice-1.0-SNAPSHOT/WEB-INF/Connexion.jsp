<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
    <%--  Bootstrap  --%>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"
            integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o"
            crossorigin="anonymous"></script>
    <link href="https://getbootstrap.com/docs/4.0/examples/sign-in/signin.css" rel="stylesheet">
</head>
<body>
<%--<form method="post" action="connexion">--%>
<%--    <fieldset>--%>
<%--        <legend>Connexion</legend>--%>

<%--        <br/>--%>
<%--        <label for="email">Identifiant</label>--%>
<%--        <input type="text" id="identifiant" name="identifiant" value="" size="20" maxlength="60"/>--%>
<%--        <br/>--%>

<%--        <label for="motdepasse">Mot de passe </label>--%>
<%--        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20"/>--%>
<%--        <br/>--%>

<%--        <input type="submit" value="Connexion" class="sansLabel"/>--%>
<%--        <br/>--%>
<%--    </fieldset>--%>
<%--</form>--%>
<div class="container text-center">
    <form class="form-signin" method="post" action="connexion">
        <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72"
             height="72">
        <h1 class="h3 mb-3 font-weight-normal">Connexion</h1>

        <label for="identifiant" class="sr-only">Identifiant</label>
        <input type="text" id="identifiant" name="identifiant" class="form-control" placeholder="Identifiant ici..."
               required="" autofocus="">

        <label for="motdepasse" class="sr-only">Mot de passe</label>
        <input type="password" id="motdepasse" name="motdepasse" class="form-control" placeholder="Mot de passe ici..."
               required="">

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div>

</body>
</html>