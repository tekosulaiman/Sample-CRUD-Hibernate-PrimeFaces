package dao.impl;

import dao.DataDAO;
import java.util.List;
import model.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import resources.HibernateUtil;

/**
 * @author tombisnis@yahoo.com
 */
public class DataDAOImpl implements DataDAO{
    private Session session;
    private SessionFactory sessionFactory;
    
    public DataDAOImpl(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void save(Data data) {
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.save(data);
        session.getTransaction().commit();
    }

    @Override
    public void saveOrUpdate(Data data) {
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.saveOrUpdate(data);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Data data) {
        session = sessionFactory.openSession();
        
        session.getTransaction().begin();  
        session.delete(data);
        session.getTransaction().commit();
    }

    @Override
    public List<Data> getAllDatas() {
        session = HibernateUtil.getSessionFactory().openSession();
        return (List<Data>) session.createCriteria(Data.class).list();
    }
}