package fr.g4.jee;

import java.util.List;

public interface CatalogueService {
    void create(final Produit produit);
    Produit findByName(final String name);
    List<Produit> findAll();
    void update(final Produit produit);
    void deleteByNom(final String nom);
}
