package net.joastbg.sampleapp.dao;

import java.util.List;
import net.joastbg.sampleapp.entities.Assurance;
import net.joastbg.sampleapp.exceptions.DaoException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AssuranceDao {

    @Autowired
    SessionFactory sessionFactory;
    
    public Long persist(Assurance assurance){
        Session session = sessionFactory.getCurrentSession();
        Long returnID = (Long) session.save(assurance);
        return returnID;
    }
    
    public Assurance find(Long id){
		Session session = sessionFactory.getCurrentSession();
		return (Assurance) session.load(Assurance.class, id);
    }
    
    public Assurance findByNumero(Long numero) throws DaoException {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("FROM Assurance WHERE numero = :numero");
		q.setString("numero", numero.toString());
		return (Assurance)q.uniqueResult();

    }

    public List<Assurance> findAll(){
        Session session = sessionFactory.getCurrentSession();
        return  session.createQuery("from Assurance").list();
    }
}
