package home.test.service;

import home.test.model.User;
import home.test.persistence.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class ShowAllUsersService {
    public static List<User> showAllUsers(){

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        //List<User> users = new ArrayList<User>();
        Query query;

//        query = session.createQuery("from user where firstName = :firstName ");
//        query.setParameter("firstName", "Alex");
//        List list = query.list();

//        query = session.createQuery("from user");
//        List<User> list = query.list();


        HibernateUtil.shutdown();

        return null;//list;
    }
}
