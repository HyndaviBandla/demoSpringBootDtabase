package Btech.hyndavi.demo.service;

import Btech.hyndavi.demo.entity.Product;
import Btech.hyndavi.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductRepository repository;
    //        post methods
    public Product saveProduct(Product thing){
        return(repository.save(thing));
    }
    public List<Product> saveProducts(List<Product> things){
        return(repository.saveAll(things));
    }
    //get methods
    public List<Product> getProducts(){
        return(repository.findAll());
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "item deleted!!!"+id ;
    }

//method for put and delete
public Product updateProduct(Product item){
        Product existingProduct=repository.findById(item.getId()).orElse(null);
        existingProduct.setName(item.getName());
        existingProduct.setPrice(item.getPrice());
    existingProduct.setQuantity(item.getQuantity());
    return  repository.save(existingProduct);


}
}
