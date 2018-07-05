package net.joastbg.sampleapp.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PersonnePhysique extends Client{
    
    @Column
    private String nom;
    
    @Column
    private String prenom;
    
    @Column
    private Date dateNaissance;
    
    public PersonnePhysique(){
        
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dateNaissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
}
