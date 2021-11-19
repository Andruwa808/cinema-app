package andrii.gorichko.spring.dao;

import andrii.gorichko.spring.model.Order;
import andrii.gorichko.spring.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
