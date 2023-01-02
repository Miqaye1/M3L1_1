import java.util.Scanner;

public class quiz {
    public static Character player;
    public static Quest quest;
    public static Quest2 quest2;
    public static Quest3 quest3;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("привет, скажите ваше имя");
        player = new Character(in.next());
        quest = new Quest();
        quest2 = new Quest2();
        quest3 = new Quest3();
        // while (rue) {
        player.money = quest.current_question.money2;
        player.Number_of_answered_questions = quest.current_question.Number_of_answered_questions2;
        System.out.println(quest.current_question.subject);
        System.out.println(quest.current_question.text);
        int a = in.nextInt();
        while (a != 1 && a != 2 && a != 3 && a != 4) {
            System.out.println("Вы можете выбирать из 4 вариантов");
            a = in.nextInt();
        }
        quest.go(a);
        player.money = quest.current_question.money2;
        player.Number_of_answered_questions = quest.current_question.Number_of_answered_questions2;
        System.out.println(quest.current_question.subject);
        System.out.println(quest.current_question.text);
        if (quest.current_question.a == 0) {
            System.out.println("the end!");
            System.exit(0);
        } else if (quest.current_question.a == 1) {
            //  while (true) {
            player.money = quest2.current_question2.money2;
            player.Number_of_answered_questions = quest2.current_question2.Number_of_answered_questions2;
            System.out.println(quest2.current_question2.subject);
            System.out.println(quest2.current_question2.text);
            int b = in.nextInt();
            while (b != 1 && b != 2 && b != 3 && b != 4) {
                System.out.println("Вы можете выбирать из 4 вариантов");
                b = in.nextInt();
            }
            quest2.go2(b);
            player.money = quest2.current_question2.money2;
            player.Number_of_answered_questions = quest2.current_question2.Number_of_answered_questions2;
            System.out.println(quest2.current_question2.subject);
            System.out.println(quest2.current_question2.text);
            if (quest2.current_question2.a == 0) {
                System.out.println("the end!");
                System.exit(0);
            } else if (quest2.current_question2.a == 1) {
                // while (true) {
                player.money = quest3.current_question3.money2;
                player.Number_of_answered_questions = quest3.current_question3.Number_of_answered_questions2;
                System.out.println(quest3.current_question3.subject);
                System.out.println(quest3.current_question3.text);
                int c = in.nextInt();
                while (c != 1 && c != 2 && c != 3 && c != 4) {
                    System.out.println("Вы можете выбирать из 4 вариантов");
                    c = in.nextInt();
                }
                quest3.go3(c);
                player.money = quest3.current_question3.money2;
                player.Number_of_answered_questions = quest3.current_question3.Number_of_answered_questions2;
                System.out.println(quest3.current_question3.subject);
                System.out.println(quest3.current_question3.text);
                System.out.println("the end");

            }
        }
    }
}


