import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Answer[] answer1 = new Answer[3];
        answer1[0] = new Answer("15", false);
        answer1[1] = new Answer("25", true);
        answer1[2] = new Answer("55", false);
        Answer[] answer2 = new Answer[3];
        answer2[0] = new Answer("55", false);
        answer2[1] = new Answer("10", true);
        answer2[2] = new Answer("3", false);
        Answer[] answer3 = new Answer[3];
        answer3[0] = new Answer("18", false);
        answer3[1] = new Answer("27", true);
        answer3[2] = new Answer("24", false);
        Question[] questions = new Question[3];
        questions[0] = new Question("5*5=", answer1);
        questions[1] = new Question("2*5=", answer2);
        questions[2] = new Question("9*3=", answer3);
        Game game = new Game("Тест на знание таблицы умножения", questions);
        game.start();
    }
}