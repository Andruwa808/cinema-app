package andrii.gorichko.spring.service.impl;

import andrii.gorichko.spring.dao.RoleDao;
import andrii.gorichko.spring.exception.DataProcessingException;
import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.RoleName;
import andrii.gorichko.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(RoleName roleName) {
        return roleDao.getRoleByName(roleName)
                .orElseThrow(() -> new DataProcessingException("Can't get role " + roleName));
    }
}
