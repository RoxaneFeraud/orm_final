/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp;

import junit.framework.Assert;
import net.joastbg.sampleapp.dao.AssuranceDao;
import net.joastbg.sampleapp.entities.Assurance;
import net.joastbg.sampleapp.exceptions.DaoException;
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
public class AssuranceDaoTest {

    @Autowired
    AssuranceDao assuranceDao;

    Assurance assurance;

    @Before
    public void setUp() {
        assurance = new Assurance();
        assurance.setNumero(123456L);
    }

    @Test
    public void testPersist() {
        Long id = assuranceDao.persist(assurance);
        Assert.assertTrue(id != null);
    }

    @Test
    public void testFind() {
        Long id = assuranceDao.persist(assurance);
        Assurance assuranceFound = assuranceDao.find(id);
        Assert.assertNotNull(assuranceFound);
        Assert.assertEquals(assurance, assuranceFound);
    }

}
