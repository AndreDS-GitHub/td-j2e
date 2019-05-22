package fr.g4.jee;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatalogueServlet", urlPatterns = "/catalogue")
public class CatalogueServlet extends HttpServlet {
    // on injecte un bean de CatalogueService
    @EJB
    private CatalogueService catalogueService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // On récupère la session
        HttpSession session = req.getSession();

        if (session.getAttribute( "ATT_SESSION_USER" ) == null) {
            resp.sendRedirect("/backoffice/connexion");
        } else {
            // On récupère la liste des produits
            Produit banane = new Produit("Banane", 0.98);
            Produit fraise = new Produit("Fraise", 2.80);
            Produit pomme = new Produit("Pomme", 1.80);
            Produit orange = new Produit("Orange", 1.74);
            catalogueService.create(banane);
            catalogueService.create(fraise);
            catalogueService.create(pomme);
            catalogueService.create(orange);

            final List<Produit> produits = catalogueService.findAll();

            // On partage les données avec la JSP (niveau Requête)
            req.setAttribute("produits", produits);

            // On redirige vers Catalogue.jsp
            req.getServletContext().getRequestDispatcher("/WEB-INF/Catalogue.jsp").forward(req, resp);
        }
    }
}
