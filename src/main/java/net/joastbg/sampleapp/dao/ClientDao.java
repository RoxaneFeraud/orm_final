package net.joastbg.sampleapp.dao;

import net.joastbg.sampleapp.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import net.joastbg.sampleapp.exceptions.DaoException;
import org.hibernate.Query;

@Service
@Transactional
public class ClientDao {

    @Autowired
    SessionFactory sessionFactory;

    public Long persist(Client client) {
        Session session = sessionFactory.getCurrentSession();
        Long returnID = (Long) session.save(client);
        return returnID;
    }

    public Client find(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Client) session.load(Client.class, id);
    }

    public Client findByNom(String nom) throws DaoException {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("FROM Client WHERE nom = :nom");
        q.setString("nom", nom);
        return (Client) q.uniqueResult();
    }

    public List<Client> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Client").list();
    }
}
