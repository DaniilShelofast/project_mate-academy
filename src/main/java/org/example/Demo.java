package org.example;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        User[] users = new User[5];
        users[1] = new User(4, "Vlad", "one");
        users[2] = new User(3, "Sasha", "two");
        users[3] = new User(22, "Sasha", "one");
        users[0] = new User(12, "Max", "one");
        UserRepository userRepository = new UserRepository(users);
        //System.out.println(userRepository.save(new User(6, "Alex", "33")));
        //System.out.println(userRepository.update(new User(43,"Dima","232")));
        //System.out.println(Arrays.toString(users));



    }
}
