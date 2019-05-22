package fr.g4.jee;


import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "Admin", urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {

    public static final String VUE = "/WEB-INF/Admin.jsp";



    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        HttpSession session = request.getSession();

        /* Affichage de la page d'inscription */



        if (session.getAttribute( "ATT_SESSION_USER" ) != null){

            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );


        }
        else{

            response.sendRedirect("/backoffice/connexion");


        }


    }

}