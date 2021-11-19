package andrii.gorichko.spring.dao;

import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.RoleName;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(RoleName name);
}
