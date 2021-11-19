package andrii.gorichko.spring.dao.impl;

import andrii.gorichko.spring.dao.AbstractDao;
import andrii.gorichko.spring.dao.TicketDao;
import andrii.gorichko.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
