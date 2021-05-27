package com.enespolat.demooo.dataAccess.abstracts;

import com.enespolat.demooo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
