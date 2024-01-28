package com.ced.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ced.app.model.Marque;
import org.springframework.data.jpa.repository.Query;

import java.lang.Integer;
import java.util.Optional;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
    @Query("SELECT c FROM Marque c WHERE c.nom=?1 ")
    Optional<Marque> findByNom(String prenom);
}
