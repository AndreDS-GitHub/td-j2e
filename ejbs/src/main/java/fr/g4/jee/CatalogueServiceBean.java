package fr.g4.jee;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Stateless
@Remote
@Local
public class CatalogueServiceBean implements CatalogueService{

    // comme on n'utilise pas de base de données, on stocke les produits dans une arraylist
    private static final List<Produit> produits = new ArrayList<Produit>();

    public void create(Produit produit) {
        produits.add(produit);
    }

    public Produit findByName(String nom) {
        for (Produit produit: produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }
        return null;
    }

    public List<Produit> findAll() {
        return produits;
    }

    public void update(Produit produit) {
        Integer cpt = 0;
        for (Produit produitCourant: produits) {
            if (produitCourant.getNom().equals(produit.getNom())) {
                produits.set(cpt, produit);
            }
            cpt++;
        }
    }

    public void deleteByNom(String nom) {
        for (Produit produit: produits) {
            if (produit.getNom().equals(nom)) {
                produits.remove(produit);
            }
        }
    }
}
