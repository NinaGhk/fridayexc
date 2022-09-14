package Repo;

import jdk.jfr.StackTrace;
import modul1.Product;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ProductRepoTest {


    @Test
     void list_returnAllProducts(){
        //GIVEN
        Product product1 =  new Product("T10","desk");
        Product product2 = new Product("T20","chair");
        Product product3 = new Product("T30","sofa");

        List<Product> productList =List.of(product1,product2,product3);
        ProductRepo productRepo = new ProductRepo(productList);

        //WHEN
        List<Product> actual =productRepo.list();
        //THEN
        assertEquals(productList,actual);
    }

     @Test
       void getExistingId_returnProductById(){
        //GIVEN
         Product id;Product name;
         Product product1 =  new Product("T10","desk");
         Product product2 = new Product("T20","chair");
         Product product3 = new Product("T30","sofa");

         List<Product> productList =List.of(product1,product2,product3);

         ProductRepo productRepo = new ProductRepo(productList);

         //WHEN
         Product actual=productRepo.get("T20");

         //THEN
         Product expected = new Product("T20","chair");
         assertEquals(product2,actual);
     }

         private static ProductRepo generateProductRepo(){
             Product id;Product name;
             Product product1 =  new Product("T10","desk");
             Product product2 = new Product("T20","chair");
             Product product3 = new Product("T30","sofa");
         List<Product> productList =List.of(product1,product2,product3);

         ProductRepo productRepo = new ProductRepo(productList);

         return productRepo;

     }
}