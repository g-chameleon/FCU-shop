package fcu.DEV.fcu.DEV.controller;

import fcu.DEV.fcu.DEV.model.Product;
import fcu.DEV.fcu.DEV.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * class of product controller.
 */
@RestController
public class ProductController {

  @Autowired
  ProductService productManager;

  @GetMapping("/products")
  public List<Product> getProducts() {
    return productManager.getProducts();

  }

  @GetMapping("/products/{keyword}")
  public List<Product> getProducts(@PathVariable ("keyword")String keyword){
    return productManager.getProducts(keyword);
  }
}
