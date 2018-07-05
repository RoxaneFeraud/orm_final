package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Echeances implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private Long prix;
    
    @Column
    private Date dateEmission;
    
    @Column
    private Date datePaiement;
    
    @Column
    private Date dateEmissionFacture;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the prix
     */
    public Long getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(Long prix) {
        this.prix = prix;
    }

    /**
     * @return the dateEmission
     */
    public Date getDateEmission() {
        return dateEmission;
    }

    /**
     * @param dateEmission the dateEmission to set
     */
    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    /**
     * @return the datePaiement
     */
    public Date getDatePaiement() {
        return datePaiement;
    }

    /**
     * @param datePaiement the datePaiement to set
     */
    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    /**
     * @return the dateEmissionFacture
     */
    public Date getDateEmissionFacture() {
        return dateEmissionFacture;
    }

    /**
     * @param dateEmissionFacture the dateEmissionFacture to set
     */
    public void setDateEmissionFacture(Date dateEmissionFacture) {
        this.dateEmissionFacture = dateEmissionFacture;
    }
    
    
}
