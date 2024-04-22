package com.shop.app.Repository;

import com.shop.app.Entity.factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepo extends JpaRepository <factura, Integer> {
}


