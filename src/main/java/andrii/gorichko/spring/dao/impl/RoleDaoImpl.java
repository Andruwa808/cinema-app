package andrii.gorichko.spring.dao.impl;

import andrii.gorichko.spring.dao.AbstractDao;
import andrii.gorichko.spring.dao.RoleDao;
import andrii.gorichko.spring.exception.DataProcessingException;
import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.RoleName;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(RoleName name) {
        try (Session session = factory.openSession()) {
            Query<Role> findByRoleName = session.createQuery(
                    "FROM Role WHERE name = :name", Role.class);
            findByRoleName.setParameter("name", name);
            return findByRoleName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with name " + name + "don`t exist", e);
        }
    }
}
