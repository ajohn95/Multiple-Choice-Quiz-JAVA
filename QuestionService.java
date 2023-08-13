import java.util.Scanner;

public class QuestionService
{
    Question[] questions = new Question[10];
    String[] typedAnswer = new String[10];
    int score;
    public QuestionService()
    {
        questions[0] = new Question(1,"What is the size of int?","a. 2","b. 6","c. 4","d. 8","c");
        questions[1] = new Question(2,"What is the size of double?","a. 2","b. 6","c. 4","d. 8","d");
        questions[2] = new Question(3,"What is the size of char?","a. 2","b. 6","c. 4","d. 8","a");
        questions[3] = new Question(4,"What is the size of long?","a. 6","b. 8","c. 10","d. 12","b");
        questions[4] = new Question(5,"What is the size of boolean?","a. 1","b. 2","c. 4","d. 6","a");
        questions[5] = new Question(6,"Which of the following is not a Java feature?","a. Dynamic","b. Architecture Neutral","c. Use of Pointers","d. Object-oriented","c");
        questions[6] = new Question(7,"___ is used to find and fix bugs in the Java program","a. JVM","b. JRE","c. JDK","d. JDB","d");
        questions[7] = new Question(8,"Number of primitive data types in Java are??","a. 6","b. 7","c. 8","d. 9","c");
        questions[8] = new Question(9,"Automatic type conversion is possible in which of the possible cases?","a. Byte to int","b. int to long","c. long to int","d. short to int","b");
        questions[9] = new Question(10,"When an array is passed to a method, what does the method receive?","a. The reference of the array","b. A copy of the array","c. Length of the array","d. Copy of the first element","a");
    }
    public void answerQuiz()
    {
        score = 0;
        for(int i = 0; i < questions.length; i++)
        {
            System.out.print(questions[i].getId()+". ");
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOpt1());
            System.out.println(questions[i].getOpt2());
            System.out.println(questions[i].getOpt3());
            System.out.println(questions[i].getOpt4());
            Scanner scan = new Scanner(System.in);
            typedAnswer[i] = scan.nextLine();
            if(questions[i].getAnswer().equalsIgnoreCase(typedAnswer[i]))
            {
                score++;
            }
        }

    }
    public void displayScore()
    {
        System.out.println("Your Final Score is: "+ score);

    }
    public void displayCorrectAnswers()
    {
        System.out.println("Here are the correct answers");
        for(int i = 0; i < questions.length; i++)
        {
            if(questions[i].getAnswer().equalsIgnoreCase(typedAnswer[i]))
            {
                System.out.println(questions[i].getId() +". " + questions[i].getAnswer() + " -You got the Correct Answer");
            }
            else
            {
                System.out.println(questions[i].getId() +". " + questions[i].getAnswer());
            }
        }
    }
}
