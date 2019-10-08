package home.test.service;

import home.test.entity.User;
import home.test.persistence.HibernateUtil;
import org.hibernate.Session;

public class AddUserService {
    public static void add(String firstName, String lastName){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);

        session.save(user);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }
}
