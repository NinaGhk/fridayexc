package Repo;

import com.sun.jdi.Value;
import modul1.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

     static Order addOder;
     private Map<String, Order> orders=new HashMap<>();
     private String id;

    private void foundOrder(){

      }


    public void addOrder(Order order){
          orders.put(order.getId(),order);
      }

      public Map<String, Order> getOrder(Order order){
          Order order1= orders.get(id);
          return orders;
      }

      public List<Order> ListOrders(){
        return new ArrayList<>();

    }

    public OrderRepo getOrder() {
        return getOrder();
    }
}
