package ShopService;

import Repo.ProductRepo;
import modul1.Product;

import java.util.List;

public class ShopService {

    private static ProductRepo productRepo;

    public ShopService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }


    public static String Products() {
        List<Product> allProducts = productRepo.list();
        return Products();
    }

    public static String listproducts() {
        return null;
    }

    public Product getProduct(String id){
        Product allProduct = productRepo.get(id);
        return allProduct;
     }


    public List<Product> ListProducts() {
        return ListProducts();
    }
}
