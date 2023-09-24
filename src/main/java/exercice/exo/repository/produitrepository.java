package exercice.exo.repository;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface produitrepository extends JpaRepository<produit,Long> {
}
