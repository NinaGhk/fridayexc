package Repo;

import modul1.Order;
import modul1.Product;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class OrderRepoTest {

    @Test
    void addOrderWhenGivenOrder_getOrder() {
        //GIVEN
        List<Product> products = List.of(
                new Product("id:A1", "obst"),
                new Product("id:A2", "pizza")
        );
        Order order1 = new Order("A01", products);
        OrderRepo orderRepo = new OrderRepo();
        OrderRepo.addOder = (order1);

        //WHEN
        OrderRepo actual = orderRepo.getOrder();

        //THEN
        Order expected = new Order("A01",products);
        assertEquals(expected, actual);
    }

    @Test
    void ListOrders_Whencalled_retunrAllOrders() {
        //GIVEN
        List<Product> products1 = List.of(
                new Product("id:A1", "obst"),
                new Product("id:A2", "pizza")
        );
        Order order1 = new Order("A01", products1);

        List<Product> products2 = List.of(
                new Product("id:A3", "Vegetable")
        );
        Order order2 = new Order("A02", products2);

        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrder(order1);
        orderRepo.addOrder(order2);

        //WHEN
        List<Order> actual = orderRepo.ListOrders();

        //THEN
        Order expectedOrder1 =new Order("A01", products1);
        Order expectedOrder2 =new Order("A02", products2);
        List<Order> expected = List.of(expectedOrder1,expectedOrder2);
        assertEquals(expected, actual);
    }
}