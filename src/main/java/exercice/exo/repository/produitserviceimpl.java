package exercice.exo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service 
public class produitserviceimpl implements produitservice {
    @Autowired
    produitrepository produitrepos;
    @Override
    public produit saveproduit(produit p) {
        return produitrepos.save(p);
    }

    @Override
    public produit updateproduit(produit p) {
        return produitrepos.save(p);
    }

    @Override
    public void deleteproduit(produit p) {
         produitrepos.delete(p);

    }

    @Override
    public void deleteproduitById(Long id) {
         produitrepos.deleteById(id);
    }

    @Override
    public produit getproduit(Long id) {
        return produitrepos.findById(id).get();
    }

    @Override
    public List<produit> getAllproduits() {
        return produitrepos.findAll();
    }
}
