/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.dao;

import java.util.List;
import net.joastbg.sampleapp.entities.Contact;
import net.joastbg.sampleapp.exceptions.DaoException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rferaud
 */
@Service
@Transactional
public class ContactDao {

    @Autowired
    SessionFactory sessionFactory;

    public Long persist(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
        Long returnID = (Long) session.save(contact);
        return returnID;
    }

    public Contact find(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Contact) session.load(Contact.class, id);
    }

    public Contact findByValeur(String valeur) throws DaoException {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("FROM Contact WHERE valeur = :valeur");
        q.setString("valeur", valeur);
        return (Contact) q.uniqueResult();
    }

    public List<Contact> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Contact").list();
    }

}
