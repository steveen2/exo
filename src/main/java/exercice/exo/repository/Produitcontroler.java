package exercice.exo.repository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class Produitcontroler {
    private final produitservice prodservice;
    @PostMapping
    public produit create(@RequestBody produit prod){
        return prodservice.saveproduit(prod);
    }
    @GetMapping("/read")
    public List<produit> read(){
        return prodservice.getAllproduits();
    }
    @PutMapping("/update/{id}")
    public produit update(@RequestBody produit p){
        return prodservice.updateproduit(p );
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable Long id){
         prodservice.deleteproduitById(id);
    }

}
