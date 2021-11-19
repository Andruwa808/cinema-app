package andrii.gorichko.spring.service.impl;

import andrii.gorichko.spring.model.RoleName;
import andrii.gorichko.spring.model.User;
import andrii.gorichko.spring.service.AuthenticationService;
import andrii.gorichko.spring.service.RoleService;
import andrii.gorichko.spring.service.ShoppingCartService;
import andrii.gorichko.spring.service.UserService;
import java.util.HashSet;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(new HashSet<>());
        user.getRoles().add(roleService.getRoleByName(RoleName.USER));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
