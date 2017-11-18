package user.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestEnums {
    public static final char vowels[] = {'a', 'o', 'i', 'e', 'u', 'y'};
    public static final char consonants[] = {'b', 'c', 'p', 'r', 'm', 'x'};

    public static void main(String[] args) {

        generateUsers(50).forEach(System.out::println);

    }

    public static List<User> generateUsers(int userCount) {

        List<User> userList = new ArrayList<>();
        for (String name : generateName(userCount)) {
            userList.add(new User(name));
        }


        return userList;
    }

    public static List<String> generateName(int totalCount) {
        List<String> userNameList = new ArrayList<>();
        for (int i = 0; i < totalCount; i++) {
            userNameList.add(getRandomName());

        }
        return userNameList;
    }

    public static String getRandomName() {

        Random random = new Random();
        String name = "";
        int nameLenths = (int) (Math.random() * 10);
        if (nameLenths < 2) nameLenths = 2;
        else if (nameLenths > 5) nameLenths = 5;
        for (int i = 0; i < nameLenths; i++) {

            if (random.nextBoolean()) {
                name += vowels[random.nextInt(vowels.length)];
            } else {
                name += consonants[random.nextInt(consonants.length)];
            }
        }

        return name.replaceFirst(name.substring(0, 1), name.substring(0, 1).toUpperCase());
    }
}
