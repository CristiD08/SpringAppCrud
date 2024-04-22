package com.shop.app.Repository;

import com.shop.app.Entity.produs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdusRepo extends JpaRepository <produs, Integer> {
}
