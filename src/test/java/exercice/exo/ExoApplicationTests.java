package exercice.exo;

import exercice.exo.repository.produit;
import exercice.exo.repository.produitrepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ExoApplicationTests {

	@Autowired
	private produitrepository produitreposiory;
	@Test
	public void testCreateproduit(){
		long a=45;
		produit prod = new produit(a,"PC hp",2500.2,new Date());
		produitreposiory.save(prod);
	}

@Test
	public void testFindproduit(){
		produit p = produitreposiory.findById(10L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateproduit(){
		produit p = produitreposiory.findById(10L).get();
		p.setPrixproduit(2000.0);
		produitreposiory.save(p);
		System.out.println(p);
	}
	@Test
	public void testDeleteproduit(){
		produitreposiory.deleteById(9L);
	}
	@Test
	public void testFindAllproduit(){
		List<produit> prods= produitreposiory.findAll();
		for(produit p:prods)
			System.out.println(p);
	}
}
