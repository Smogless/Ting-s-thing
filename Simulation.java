import java.util.Scanner;
import java.util.Random;
public class Simulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        final int subjectNumber = 20;
        GenerateSubjects s = new GenerateSubjects(subjectNumber);
        Subject[] subjects = s.getSubjects();
        String flag = "";
        System.out.println("Press enter to run simulation cycle (any other key to end simulation)");
        flag = input.nextLine();
        while (flag.equals("\n")) {
            for (Subject sub : subjects) {
                boolean isDrinking;
                int d = random.nextInt(2);
                if (d == 0) {
                    isDrinking = true;
                }
                else {
                    isDrinking = false;
                }

                if (isDrinking) {
                    //GENERATE BAC
                }

            }
            System.out.println("Press enter to run simulation cycle (any other key to end simulation)");
            flag = input.nextLine();
        }
    }
}
