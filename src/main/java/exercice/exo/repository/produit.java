package exercice.exo.repository;


import javax.persistence.*;

import java.util.Date;
@Entity
@Table
public class produit {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idproduit;
    @Column
    private String nom;
    @Column
    private Double prixproduit;
    private Date datecreation;


    public produit() {
        super();
        // TODO Auto-generated constructor stub
    }

    public produit(Long idproduit, String nom, Double prixproduit, Date datecreation) {
        this.idproduit = idproduit;
        this.nom = nom;
        this.prixproduit = prixproduit;
        this.datecreation = datecreation;
    }

    public produit(String nom, Double prixproduit, Date datecreation) {
        super();
        this.nom = nom;
        this.prixproduit = prixproduit;
        this.datecreation = datecreation;
    }


    public long getIdproduit() {
        return idproduit;
    }
    public void setIdproduit(long idproduit) {
        this.idproduit = idproduit;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Double getPrixproduit() {
        return prixproduit;
    }
    public void setPrixproduit(Double prixproduit) {
        this.prixproduit = prixproduit;
    }
    public Date getDatecreation() {
        return datecreation;
    }
    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }


    @Override
    public String toString() {
        return "produit{" +
                "nom='" + nom + '\'' +
                ", prixproduit=" + prixproduit +
                ", datecreation=" + datecreation +
                '}';
    }
}
