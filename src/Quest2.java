public class Quest2 {
    private Question second_question;
    public Question current_question2;

    Quest2(){
            second_question = new Question(
                    "Перейдем ко второму вопросу\n",
                    "Сколько длится мгновение?\n" +
                            "(1)60 секунд\n" +
                            "(2)90 секунд\n"+
                            "(3)120 секунд\n"+
                            "(4)180 секунд\n", 4,500,1,2);
            current_question2 = second_question;
            second_question.option[0] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ второй вариант, 90 секунд\n" +
                            "вы проиграли игру но заработали 500 долларов\n", 0, 500, 1,0
            );
            second_question.option[1] = new Question(
                    "ваш ответ правильный\n",
                    "поздравляю, вы выиграли 1000 долларов\n",
                    4, 1000, 2,1
            );
            second_question.option[2] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ второй вариант, 90 секунд\n" +
                            "вы проиграли игру но заработали 500 долларов\n", 0, 500, 1,0
            );
            second_question.option[3] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ второй вариант, 90 секунд\n" +
                            "вы проиграли игру но заработали 500 долларов\n", 0, 500, 1,0
            );
            current_question2 = second_question;
        }
    public void go2(int num) {
        if (num <= current_question2.option.length)
            current_question2 = current_question2.option[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_question2.option.length + " вариантов");
    }
}

