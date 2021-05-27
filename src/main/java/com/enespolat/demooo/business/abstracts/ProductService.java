package com.enespolat.demooo.business.abstracts;

import com.enespolat.demooo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
