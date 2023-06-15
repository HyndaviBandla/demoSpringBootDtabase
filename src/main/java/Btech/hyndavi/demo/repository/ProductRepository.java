package Btech.hyndavi.demo.repository;

import Btech.hyndavi.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
//    model name and datatype of primary key as given as arguments in jpa repository
//    logic to connect our database all the data related properties can be kept application.properties or can also add in yml file
Product findByName(String name);
}
