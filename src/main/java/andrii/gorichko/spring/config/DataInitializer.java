package andrii.gorichko.spring.config;

import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.RoleName;
import andrii.gorichko.spring.model.User;
import andrii.gorichko.spring.service.RoleService;
import andrii.gorichko.spring.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@i.ua");
        admin.setPassword("admin123");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        User user = new User();
        user.setEmail("user@i.ua");
        user.setPassword("user123");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
