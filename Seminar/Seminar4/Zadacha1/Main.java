package Seminar.Seminar4.Zadacha1;

import Seminar.Seminar1.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> user = new ArrayList<>();
        User user1 = new User("Ivan", "Ivanov");
        User user2 = new User("Vladimir", "Petrov");
        User user3 = new User("Kitty", "Monson");

        user.add(user1);
        user.add(user2);
        user.add(user3);

        user.sort(new UserComparator<>());
        System.out.println(user);

        for (User UserList : user) { // итерация по фамилии
            System.out.println(UserList.getFirstName());
        }

        Dogs dog1 = new Dogs("Mulya", 10);
        Dogs dog2 = new Dogs("Koza", 10);

        List<Dogs> dogs = new ArrayList<>(List.of(dog1, dog2));

        dogs.sort(new UserComparator<Dogs>());
        System.out.println(dogs);

    }
}

