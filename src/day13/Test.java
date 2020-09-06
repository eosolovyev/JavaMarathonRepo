package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hi form user1");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi user1");
        user2.sendMessage(user1, "I am user2. Nice to meet you");
        user2.sendMessage(user1, "I'm fine  and you?");

        user3.sendMessage(user1, "Hi. I am user3");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We worked together");

        user1.sendMessage(user3, "Hello user3");
        user1.sendMessage(user3, "I remember");
        user1.sendMessage(user3, "Let's meet up");

        user3.sendMessage(user1, "Yes, let's go");

        MessageDatabase.showDialog(user1, user3);

    }
}
