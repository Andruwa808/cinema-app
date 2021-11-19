package andrii.gorichko.spring.service;

import andrii.gorichko.spring.model.Order;
import andrii.gorichko.spring.model.ShoppingCart;
import andrii.gorichko.spring.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
