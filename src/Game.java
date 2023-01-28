import java.util.Scanner;
public class Game {
    private String name;
    private Question[] questions;
    private int counter = 0;

    public Game(String name, Question[] questions) {
        this.name = name;
        this.questions = questions;
    }

    public void start() {
        System.out.println("Проверь знание таблицы умножения");
        for (int i = 0; i < questions.length; i++) {
            int b = questions[i].getAnswers().length;
            System.out.println("Вопрос: " + questions[i].getTitle());
            System.out.println("Выбери свой вариант ответа: ");
            for (int t = 0; t < b; t++) {
                String s = questions[i].getAnswers()[t].value;
                System.out.println(s);
            }
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            boolean flag = false;
            for (int j = 0; j < b; ++j) {
                String s = questions[i].getAnswers()[j].value;
                boolean c = string.equals(s);
                boolean c2 = (questions[i].getAnswers()[j].correct == true);
                if (c && c2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                counter++;
            }
        }
        if (counter == 3) {
            System.out.println("Все правильно!Молодец!");
        } else {
            System.out.println("Попробуй еще раз");
        }
    }
}




