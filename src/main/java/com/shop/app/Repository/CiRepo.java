package com.shop.app.Repository;

import com.shop.app.Entity.ci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiRepo extends JpaRepository <ci, Integer> {
}
