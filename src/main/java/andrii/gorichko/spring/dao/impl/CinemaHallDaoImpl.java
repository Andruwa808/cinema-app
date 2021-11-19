package andrii.gorichko.spring.dao.impl;

import andrii.gorichko.spring.dao.AbstractDao;
import andrii.gorichko.spring.dao.CinemaHallDao;
import andrii.gorichko.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
