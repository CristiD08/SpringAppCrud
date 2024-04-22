package com.shop.app.Repository;

import com.shop.app.Entity.comanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComandaRepo extends JpaRepository <comanda,Integer> {
}
