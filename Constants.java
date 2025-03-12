public class Constants {
    public static class colorConstants {
        static String RESET = "\u001B[0m";
        static String RED = "\u001B[31m";
        static String BLUE = "\033[1;34m";
        static String GREEN = "\033[0;32m";
        static String BRIGHT_YELLOW = "\u001B[33;1m";
    }
    public static class logicConstants {
        static double legalBACLimit = 0.08;
        static double extremelyHighBAC = 0.12;
        static int minimumContactListSize = 10;
        static int contactListVariance = 10;
        static int maximumBAC = 20; //0.x% where x = maximumBAC
        static int subjectCount = 20;
        static int minimumAge = 21;
        static int ageVariance = 79;
    }
}
