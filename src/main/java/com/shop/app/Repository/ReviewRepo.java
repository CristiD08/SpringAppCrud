package com.shop.app.Repository;

import com.shop.app.Entity.review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository <review, Integer> {
}
