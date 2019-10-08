package home.test;

import home.test.entity.User;
import home.test.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("*********** Maven + Hibernate + MySQL ***************");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Alexander");
        user.setLastName("Barchuk");

        session.save(user);
        session.getTransaction().commit();
    }

}

