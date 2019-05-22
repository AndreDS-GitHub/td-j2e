package fr.g4.jee;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( name = "ProduitServlet", urlPatterns = "/produit")
public class ProduitServlet extends HttpServlet {

    @EJB
    private CatalogueService catalogueService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        // vérification s'il y a des parametres
        // Si pas de paramètres, ajouter Produit
        // Sinon si paramètre, page de modification Produit
        String name = req.getParameter("name");
        String delete = req.getParameter("delete");

        // recuperation parameters
        if (null == name) {
            // On redirige vers New Produitt
            req.getServletContext().getRequestDispatcher("/WEB-INF/NouveauProduit.jsp").forward(req, resp);
        } else {
            // On partage les données avec la JSP (niveau Requête)
            req.setAttribute("produit", catalogueService.findByName(name));
            if (null == delete) {
                // On redirige vers Modify Produit
                req.getServletContext().getRequestDispatcher("/WEB-INF/ModifierProduit.jsp").forward(req, resp);
            } else {
                // On redirige vers Modify Produit
                req.getServletContext().getRequestDispatcher("/WEB-INF/DeleteProduit.jsp").forward(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Double prix = Double.parseDouble(req.getParameter("price"));
        String desc = req.getParameter("description");

        Produit produit = new Produit(name, desc, prix);

        // On vérifie si le produit existe ou pas dans la liste (pour distinguer New de Modify)
        if (null != catalogueService.findByName(name)) {
            catalogueService.update(produit);
        } else {
            catalogueService.create(produit);
        }

        resp.sendRedirect("/backoffice/catalogue");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        catalogueService.deleteByNom(name);
        resp.sendRedirect("/backoffice/catalogue");
    }
}
