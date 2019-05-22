package fr.g4.jee;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Connexion", urlPatterns = "/connexion")
public class ConnexionServlet extends HttpServlet {

    public static final String VUE = "/WEB-INF/Connexion.jsp";
    public static final String CHAMP_ID = "identifiant";
    public static final String CHAMP_PASS = "motdepasse";

    public static final String ATT_SESSION_USER = "sessionUtilisateur";



    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        String identifiant = request.getParameter( CHAMP_ID );
        String motDePasse = request.getParameter( CHAMP_PASS );



        if (identifiant != null && motDePasse != null) {
            if (identifiant.equals("admin") && motDePasse.equals("password")){
                HttpSession session = request.getSession();
                session.setAttribute("ATT_SESSION_USER", "O");
                response.sendRedirect("/backoffice/admin");
            }
            else {
                response.sendRedirect("/backoffice/connexion");
            }
        }
        else {
            response.sendRedirect("/backoffice/connexion");
        }


    }

}