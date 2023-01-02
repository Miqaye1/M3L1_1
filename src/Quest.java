public class Quest {
    private Question first_question;
    public Question current_question;

    Quest() {
        first_question = new Question(
                "это игра кто хочет стать миллионером\n",
                "Первый вопрос\n" + " Какая страна производит больше всего кофе в мире?\n"+
                        "(1) Колумбия\n"+
                        "(2)Индонезия\n" +
                        "(3)Бразилия\n" +
                        "(4)Вьетнам\n", 4,0,0, 2);
        current_question = first_question;
        first_question.option[0] = new Question(
                "ваш ответ неправильный\n",
                "правильный ответ третий вариант, бразилия\n" +
                        "и вы проиграли игру\n", 0, 0, 0,0
        );
        current_question = first_question;
        first_question.option[1] = new Question(
                "ваш ответ неправильный\n",
                "правильный ответ третий вариант, бразилия\n"  +
                        "и вы проиграли игру\n", 0, 0, 0, 0
        );
        current_question = first_question;
        first_question.option[2] = new Question(
                "ваш ответ правильный\n",
                "поздравляю, вы выиграли 500 долларов\n",
                4, 500, 1,1
        );
        current_question = first_question;
        first_question.option[3] = new Question(
                "ваш ответ неправильный\n",
                "правильный ответ третий вариант, бразилия\n" +
                        "и вы проиграли игру\n", 0, 0, 0, 0
        );
        current_question = first_question;
    }
    public void go(int num) {
        if (num <= current_question.option.length)
            current_question = current_question.option[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_question.option.length + " вариантов");
    }
}
