package ShopService;

import Repo.ProductRepo;
import modul1.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
         String id;

        List<Product> products= List.of(
                new Product("id:A1","obst"),
                new Product("id:A2","pizza"),
                new Product("id:A3","Vegetable")
      );
        ProductRepo productRepo= new ProductRepo(products);
        ShopService shopService = new ShopService(productRepo);
        System.out.println(ShopService.listproducts());

    }
}
