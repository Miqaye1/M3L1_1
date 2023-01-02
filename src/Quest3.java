public class Quest3 {
    private Question third_question;
    public Question current_question3;
    Quest3(){
            third_question = new Question(
                    "мы переходим к последнему вопросу\n",
                    "Какая самая маленькая планета в нашей Солнечной системе?\n" +
                            "(1)Земля\n" +
                            "(2)Венера\n" +
                            "(3)Марс\n" +
                            "(4)Меркурий\n", 4,1000,2,2);
            third_question.option[0] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ четвертый вариант, Меркурий\n" +
                            "вы проиграли игру но заработали 1000 долларов\n", 0, 1000, 2,0
            );
            third_question.option[1] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ четвертый вариант, Меркурий\n" +
                            "вы проиграли игру но заработали 1000 долларов\n", 0, 1000, 2,0
            );
            third_question.option[2] = new Question(
                    "ваш ответ неправильный\n",
                    "правильный ответ четвертый вариант, Меркурий\n" +
                            "вы проиграли игру но заработали 1000 долларов\n", 0, 1000, 2,0
            );

            third_question.option[3] = new Question(
                    "ваш ответ правильный\n",
                    "поздравляю вы выиграли игру и 2000 долларов\n",4, 2000, 3,1
            );
            current_question3 = third_question;
        }
    public void go3(int num) {
        //if (num <= current_question3.option.length)
            current_question3 = current_question3.option[num - 1];
       // else
            //System.out.println("Вы можете выбирать из "
                  //  + current_question3.option.length + " вариантов");
    }
}

