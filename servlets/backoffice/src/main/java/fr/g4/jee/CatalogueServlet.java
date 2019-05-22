package fr.g4.jee;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatalogueServlet", urlPatterns = "/catalogue-servlet")
public class CatalogueServlet extends HttpServlet {
    // on injecte un bean de CatalogueService
    @EJB
    private CatalogueService catalogueService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        // On récupère la liste des produits
        final List<Produit> produits = catalogueService.findAll();

        // On partage les données avec la JSP (niveau Requête)
        req.setAttribute("produits", produits);

        // On redirige vers Catalogue.jsp
        req.getServletContext().getRequestDispatcher("/WEB-INF/Catalogue.jsp").forward(req, resp);
    }
}
