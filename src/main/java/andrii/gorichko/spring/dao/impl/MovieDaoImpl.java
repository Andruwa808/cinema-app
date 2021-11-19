package andrii.gorichko.spring.dao.impl;

import andrii.gorichko.spring.dao.AbstractDao;
import andrii.gorichko.spring.dao.MovieDao;
import andrii.gorichko.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
