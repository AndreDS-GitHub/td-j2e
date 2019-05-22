package fr.g4.jee;


import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "Deconnexion", urlPatterns = "/deconnexion")
public class DeconnexionServlet extends HttpServlet {

    public static final String VUE = "/WEB-INF/Connexion.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        HttpSession session = request.getSession();
        session.setAttribute("ATT_SESSION_USER", null);
        response.sendRedirect("/backoffice/catalogue");
    }

}