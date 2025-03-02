import javax.crypto.Cipher;
import java.util.Scanner;
import java.util.Random;

public class Simulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int timeCycleCount = 0;
        GenerateSubjects s = new GenerateSubjects(Constants.logicConstants.subjectCount);
        Subject[] subjects = s.getSubjects();
        String flag = "";
        System.out.println("Press enter to run simulation cycle (any other key to end simulation)");
        flag = input.nextLine();
        while (flag.equals("")) {
            timeCycleCount++;
            System.out.println(Constants.colorConstants.BLUE + "TIME CYCLE: " + timeCycleCount + Constants.colorConstants.RESET);
            for (Subject sub : subjects) {
                boolean isDrinking;
                int d = random.nextInt(2);
                if (d == 0) {
                    isDrinking = true;
                } else {
                    isDrinking = false;
                }

                if (isDrinking) {
                    //GENERATE Blood Alcohol Content (BAC)
                    double BAC = random.nextInt(Constants.logicConstants.maximumBAC) / 10;
                    if (BAC >= Constants.logicConstants.legalBACLimit) {
                        System.out.println();
                        System.out.println(Constants.colorConstants.RED + sub.name + "'s BAC is above the legal limit! CALLING EMERGENCY CONTACTS" + Constants.colorConstants.RESET);
                        sub.messageEmergencyContacts();
                    }
                }

            }
            System.out.println();
            System.out.println("Double tap enter to run new simulation cycle (any other key + enter to end simulation)");
            flag = input.nextLine();
            if (flag.equals(""))
                input.nextLine();
        }

        System.out.println(Constants.colorConstants.GREEN + "Simulation finished!" + Constants.colorConstants.RESET);
    }
}
