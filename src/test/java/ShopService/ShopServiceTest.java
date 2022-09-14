package ShopService;

import Repo.ProductRepo;
import modul1.Product;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ShopServiceTest {

    private List<Product> products;

    @Test
    void ListProducts_WhenCalled_returnAllProducts() {
        //GIVEN
        ProductRepo productRepo = new ProductRepo(products);
        ShopService shopService = new ShopService(productRepo);
        //WHEN
        List<Product> actual = shopService.ListProducts();

        //THEN
        List<Product> expected = List.of(
                new Product("T10", "desk"),
                new Product("T20", "chair"),
                new Product("T30", "sofa")
        );
        assertEquals(expected, actual);
    }

    private static ProductRepo generateProductRepo() {
        Product id;
        Product name;
        Product product1 = new Product("T10", "desk");
        Product product2 = new Product("T20", "chair");
        Product product3 = new Product("T30", "sofa");

        List<Product> productList = List.of(product1, product2, product3);

        ProductRepo productRepo = new ProductRepo(productList);

        return productRepo;
    }

    @Test
    void getWhenGivenExistingId_returnFoundProduct() {
        //GIVEN

        ProductRepo productRepo = generateProductRepo();
        ShopService shopService = new ShopService(productRepo);

        //WHEN
        Product actual = shopService.getProduct("T20");
        //THEN
        Product expected = new Product("T20", "chair");
        assertEquals(expected, actual);

    }
}
