package com.example.Website.dao;

import com.example.Website.model.Thamgia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThamgiaDAOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    ThamgiaDAO thamgiaDAO=new ThamgiaDAO();
    @Test
    void getThamgia() {
        //Co ton tai tran dau co thu da dau
        int idCothu=1;
        List<Thamgia> thamgiaList=thamgiaDAO.getThamgia(idCothu);
        assertNotNull(thamgiaList);
    }
}