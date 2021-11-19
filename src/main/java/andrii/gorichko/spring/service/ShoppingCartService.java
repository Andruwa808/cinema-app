package andrii.gorichko.spring.service;

import andrii.gorichko.spring.model.MovieSession;
import andrii.gorichko.spring.model.ShoppingCart;
import andrii.gorichko.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
