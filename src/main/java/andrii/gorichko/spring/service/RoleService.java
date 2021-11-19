package andrii.gorichko.spring.service;

import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.RoleName;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(RoleName roleName);
}
