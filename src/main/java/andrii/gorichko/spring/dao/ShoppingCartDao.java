package andrii.gorichko.spring.dao;

import andrii.gorichko.spring.model.ShoppingCart;
import andrii.gorichko.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
