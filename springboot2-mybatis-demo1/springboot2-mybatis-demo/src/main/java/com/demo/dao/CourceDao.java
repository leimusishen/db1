package com.demo.dao;


import com.demo.model.Cource;

import java.util.List;

public interface CourceDao {
    void insertCourceCource( Cource cource);
    void updateCource(Cource cource);
    void deleteCource(int courceId);
    Cource getCourceById(int courceId);
    List<Cource> getAllCource();
    List<Cource> findAll();
}
