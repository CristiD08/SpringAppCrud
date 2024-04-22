package com.shop.app.Repository;

import com.shop.app.Entity.clienti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientiRepo extends JpaRepository <clienti, Integer> {
    List<clienti> findAllByNumeContaining(String nume);
}
