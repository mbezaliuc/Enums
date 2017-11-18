package user.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestEnums {
    public static final char VOWELS[] = {'a', 'o', 'i', 'e', 'u', 'y'};
    public static final char CONSONANTS[] = {'b', 'c', 'p', 'r', 'm', 'x'};

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
        StringBuilder name = new StringBuilder();
        int nameLenths = random.nextInt(4) + 2;
        for (int i = 0; i < nameLenths; i++) {
            if (random.nextBoolean()) {
                name.append(VOWELS[random.nextInt(VOWELS.length)]);
            } else {
                name.append(CONSONANTS[random.nextInt(CONSONANTS.length)]);
            }
        }
        return name.replace(0, 1, name.substring(0,1).toUpperCase()).toString();
    }
}
