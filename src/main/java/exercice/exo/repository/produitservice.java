package exercice.exo.repository;

import java.util.List;

public interface produitservice {
    produit saveproduit(produit p);
    produit updateproduit(produit p);
    void deleteproduit(produit p);
    void deleteproduitById(Long id);
    produit getproduit(Long id);
    List<produit> getAllproduits();
}
