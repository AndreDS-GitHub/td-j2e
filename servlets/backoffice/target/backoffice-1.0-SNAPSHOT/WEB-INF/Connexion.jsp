<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>

    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>


    <body>

        <form method="post" action="connexion">


            <fieldset>

                <legend>Connexion</legend>

                <br />
                <label for="email">Identifiant</label>
                <input type="text" id="identifiant" name="identifiant" value="" size="20" maxlength="60" />
                <br />


                <label for="motdepasse">Mot de passe </label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />


                <input type="submit" value="Connexion" class="sansLabel" />
                <br />


            </fieldset>

        </form>

    </body>

</html>