package fcu.DEV.fcu.DEV.controller;

import fcu.DEV.fcu.DEV.model.Product;
import fcu.DEV.fcu.DEV.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

  @GetMapping("/keyword")
  public List<Product> getProducts(@RequestParam String keyword){
    return productManager.getProducts(keyword);
  }
}
