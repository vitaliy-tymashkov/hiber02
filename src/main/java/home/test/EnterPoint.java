package home.test;

import home.test.model.User;
import home.test.service.AddUserService;
import home.test.service.ShowAllUsersService;

import java.util.List;

//Hiber tests - only addUser works well
public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("*********** Maven + Hibernate + MySQL ***************");

        AddUserService.add("Alex2", "Brat2");

        //The following doesn't work
//        List<User> list = ShowAllUsersService.showAllUsers();
//        User w = (User) list.get(0);
//        System.out.println(w.getFirstName());

        //System.out.println(Arrays.toString(list.toArray()));
        //list.stream().forEach();
    }

}

