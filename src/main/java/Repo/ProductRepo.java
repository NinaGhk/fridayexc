package Repo;

import modul1.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {


    private Map<String, Product> products = new HashMap();


    public ProductRepo(List<Product> productList){

        for (Product product: productList){
            products.put(product.getId(),product);
        }
    }

    private Map<String, Product> ProductRepo() {
        return products;
    }

    public List<Product> list(){
       return(ArrayList<Product>) products.values();
    }

    public Product get(String id){
      return products.get(id);
    }
}
