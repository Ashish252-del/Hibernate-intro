package util;
import  org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.personal.users;

public class DbConnection {
    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            // basically  SessionFactory is using configuration to give a data source that's why we need to set our annotated class in cfg so that we can use it
            configuration.addAnnotatedClass(users.class);
            // source factory is very heavy object we should make instance of it only once in our project
             sessionFactory = configuration.buildSessionFactory();
            return sessionFactory;
        }
        return sessionFactory;
    }
}
