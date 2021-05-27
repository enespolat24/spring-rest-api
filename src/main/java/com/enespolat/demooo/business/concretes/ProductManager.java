package com.enespolat.demooo.business.concretes;

import com.enespolat.demooo.business.abstracts.ProductService;
import com.enespolat.demooo.dataAccess.abstracts.ProductDao;
import com.enespolat.demooo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
