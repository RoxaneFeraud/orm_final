package net.joastbg.sampleapp;

import junit.framework.Assert;
import net.joastbg.sampleapp.dao.ClientDao;
import net.joastbg.sampleapp.entities.Assurance;
import net.joastbg.sampleapp.entities.Client;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import net.joastbg.sampleapp.exceptions.DaoException;

@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/config/BeanLocations.xml")
public class ClientDaoTest {

    @Autowired
    ClientDao clientDao;

    Client client;

    @Before
    public void setUp() {
        client = new Client();
        client.setNom("Feraud");
    }

    @Test
    public void testPersist() {
        Long id = clientDao.persist(client);
        Assert.assertTrue(id != null);
    }

    @Test
    public void testFind() {
        Long id = clientDao.persist(client);
        Client clientFound = clientDao.find(id);
        Assert.assertNotNull(clientFound);
        Assert.assertEquals(client, clientFound);
    }

    @Test
    public void testFindByNom() throws DaoException {
        //recuperation du nom à revoir
        String nom = clientDao.persist(client).toString();
        Client clientFound = clientDao.findByNom(nom);
        Assert.assertNotNull(clientFound);
        Assert.assertEquals(client, clientFound);
    }
}
