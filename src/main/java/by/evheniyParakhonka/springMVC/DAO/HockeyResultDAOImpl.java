package by.evheniyParakhonka.springMVC.DAO;

import by.evheniyParakhonka.springMVC.model.HockeyResult;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HockeyResultDAOImpl implements IHockeyResultDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private static SessionFactory getSessionFactory() {

        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(HockeyResult.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<HockeyResult> getAllResult() {
        Session session = getSessionFactory().openSession();
        List<HockeyResult> hockeyresult = session.createQuery("from HockeyResult ").list();
        session.close();
        return hockeyresult;
    }
}
