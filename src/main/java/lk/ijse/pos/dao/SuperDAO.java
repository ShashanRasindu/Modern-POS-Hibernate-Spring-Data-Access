package lk.ijse.pos.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface SuperDAO {

    public Session getSession();

}
