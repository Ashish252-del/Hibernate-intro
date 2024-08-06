package org.personal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import util.DbConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GetUser {
    public static void main(String[] args)  {
 try {
//     Configuration configuration = new Configuration();
//     configuration.configure("hibernate.cfg.xml");
//     // basically  SessionFactory is using configuration to give a data source that's why we need to set our annotated class in cfg so that we can use it
//     configuration.addAnnotatedClass(users.class);
//     SessionFactory sessionFactory = configuration.buildSessionFactory(); // source factory is very heavy object we should make instance of it only once in our project
//     // session means you are basically asking for a new connection for database
     Session session = DbConnection.getSessionFactory().openSession(); // it gives you save method to save objects in db
     users st = session.get(users.class,1); // note we can load method as well to extract data from db
     System.out.println("record is extracted ......"+st);
     session.close(); // here we are closing session
 }
    catch (Exception e) {
        System.out.println("exception is "+ e);
    }


    }
}