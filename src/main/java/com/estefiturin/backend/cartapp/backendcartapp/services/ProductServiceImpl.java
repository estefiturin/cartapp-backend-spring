package com.estefiturin.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estefiturin.backend.cartapp.backendcartapp.models.entities.Product;
import com.estefiturin.backend.cartapp.backendcartapp.repositories.ProductRepository;


@Service // componente de Spring, que maneja logica de negocio
public class ProductServiceImpl implements ProductService {

    @Autowired // para inyectar
    private ProductRepository repository; 

    @Override
    @Transactional(readOnly = true) // sincronizacion con la base de datos
    public List<Product> findAll() {
        return (List<Product>)repository.findAll();
    }
    
    
}
