package Btech.hyndavi.demo.controller;


import Btech.hyndavi.demo.entity.Product;
import Btech.hyndavi.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;
//this is the [ost method and Product is the requestbody so that input json can parse to this Product object
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product thing){
        return service.saveProduct(thing);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> things){
        return service.saveProducts(things);
    }
//    for get methods giving get api's
    @GetMapping("/finAllProducts")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById( id );
    }
    @GetMapping("/findProductByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @PutMapping ("/update")
    public Product updateProduct(@PathVariable Product thing){
        return service.saveProduct(thing);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}

