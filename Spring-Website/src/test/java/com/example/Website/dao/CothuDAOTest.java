package com.example.Website.dao;

import com.example.Website.model.Cothu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CothuDAOTest {

    @Test
    void getDSCothu() {

    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    CothuDAO cothuDAO=new CothuDAO();
    @Test
    void testGetDSCothuTestCase1() {
        //Co ton tai co thu
        List<Cothu> cothuList=cothuDAO.getDSCothu();
        assertNotNull(cothuList);
    }

}