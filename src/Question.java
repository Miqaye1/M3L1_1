public class Question {
    Question[] option;
    String subject;
    String text;
    int money2, Number_of_answered_questions2;
    int a;
    public Question(String subject, String text, int variants, int money2, int Number_of_answered_question, int a){
        this.subject = subject;
        this.text = text;
        money2 = money2;
        Number_of_answered_questions2 = Number_of_answered_questions2;
        option = new Question[variants];
        this.a = a;
    }
}

