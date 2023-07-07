package com.estefiturin.backend.cartapp.backendcartapp.services;
import com.estefiturin.backend.cartapp.backendcartapp.models.entities.Product;
import java.util.List;

public interface ProductService {
    //protocolo de implementación
        List<Product> findAll(); 
}
