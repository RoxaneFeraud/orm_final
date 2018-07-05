package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assurance implements Serializable {

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private Long numero;
    
    @Column
    private Date dateSouscription;
    
    @Column
    private Date dateAnniversaire;

    @Column
    private Date datePrelevement;
    
    @Column
    private Echeances echeance;
    
    @ManyToOne
    @JoinColumn(name = "fk_proprietaire")
    private Client proprietaire;
    

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
     * @return the dateSouscription
     */
    public Date getDateSouscription() {
        return dateSouscription;
    }

    /**
     * @param dateSouscription the dateSouscription to set
     */
    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    /**
     * @return the dateAnniversaire
     */
    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    /**
     * @param dateAnniversaire the dateAnniversaire to set
     */
    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    /**
     * @return the datePrelevement
     */
    public Date getDatePrelevement() {
        return datePrelevement;
    }

    /**
     * @param datePrelevement the datePrelevement to set
     */
    public void setDatePrelevement(Date datePrelevement) {
        this.datePrelevement = datePrelevement;
    }
    
    
}
