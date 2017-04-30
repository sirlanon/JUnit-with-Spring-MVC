package com.service;


import java.util.List;

import com.domain.Product;

public interface ProductManager{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}

