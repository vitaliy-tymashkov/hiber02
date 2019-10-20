package home.test.service;

import home.test.model.User;
import home.test.persistence.HibernateUtil;
import org.hibernate.Session;

//Add user via Hibernate - works well
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
