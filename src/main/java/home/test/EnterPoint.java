package home.test;

import home.test.entity.User;
import home.test.persistence.HibernateUtil;
import home.test.service.AddUserService;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("*********** Maven + Hibernate + MySQL ***************");

        AddUserService.add("Alex", "Brat");
    }

}

