package com.devon.market.resource;

import com.devon.market.model.Producto;
import com.devon.market.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping("/findAll")
    public List<Producto> readAll(){
        return repository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Producto> getProducto(@PathVariable String id){
        return repository.findById(id);
    }

    @GetMapping("/DeleteById/{id}")
    public void delete(@PathVariable String id){repository.deleteById(id);}
}
