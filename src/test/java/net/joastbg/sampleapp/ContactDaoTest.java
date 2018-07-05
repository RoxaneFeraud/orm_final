/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp;

import junit.framework.Assert;
import net.joastbg.sampleapp.dao.ContactDao;
import net.joastbg.sampleapp.entities.Client;
import net.joastbg.sampleapp.entities.Contact;
import net.joastbg.sampleapp.entities.TypeContact;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rfera
 */
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/config/BeanLocations.xml")
public class ContactDaoTest {

    @Autowired
    ContactDao contactDao;
    
    Contact contact;
    
    Client client;
    
    @Before
    public void setUp() {
        contact = new Contact();
        contact.setTypeContact(TypeContact.MAIL);
        client = new Client();
        client.setNom("Cathy Catou");
        contact.setProprietaire(client);
    }

    @Test
    public void testPersist() {
        Long id = contactDao.persist(contact);
        Assert.assertTrue(id != null);
    }

    @Test
    public void testFind() {
        Long id = contactDao.persist(contact);
        Contact contactFound = contactDao.find(id);
        Assert.assertNotNull(contactFound);
        Assert.assertEquals(contact, contactFound);
    }
}
