package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nom;

    @OneToMany
    @JoinColumn(name = "contact_id")
    private List<Contact> contacts = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "compte_id")
    private List<CompteBancaire> comptes = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "assurance_id")
    private List<Assurance> assurances = new ArrayList<>();

    public Client() {

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
     * @return the contacts
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * @return the comptes
     */
    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    /**
     * @param comptes the comptes to set
     */
    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

    /**
     * @return the assurances
     */
    public List<Assurance> getAssurances() {
        return assurances;
    }

    /**
     * @param assurances the assurances to set
     */
    public void setAssurances(List<Assurance> assurances) {
        this.assurances = assurances;
    }

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

}
