import java.util.Random;
public class GenerateSubjects {
    int subjectNumber;
    Subject[] subjects;
    String[] subjectNames = {"Adrian", "Amelia", "Aiden", "Bianca", "Alejandro", "Cadence", "Amir", "Dahlia", "Andre", "Eden",
            "Angelo", "Fiona", "Antonio", "Gabriella", "Ashton", "Harmony", "Beau", "Hazel", "Blake", "Isla",
            "Brady", "Ivy", "Brody", "Jade", "Cade", "Jasmine", "Callum", "Jocelyn", "Calvin", "Juliette",
            "Cameron", "Kaylee", "Cesar", "Lillian", "Charlie", "Lucia", "Colton", "Lydia", "Damian", "Madeline",
            "Damon", "Melody", "Dante", "Naomi", "Declan", "Noelle", "Desmond", "Paige", "Dominic", "Penelope",
            "Donovan", "Scarlett", "Easton", "Adriana", "Elias", "Alana", "Elliott", "Alexandria", "Emerson", "Amara",
            "Emmett", "Annabelle", "Ezra", "Ariella", "Felix", "Autumn", "Finn", "Camila", "Grayson", "Cecilia",
            "Griffin", "Celeste", "Hector", "Charlotte", "Holden", "Claire", "Hugo", "Colette", "Ivan", "Delilah",
            "Jaxon", "Elise", "Joaquin", "Eliza", "Jonas", "Esme", "Julian", "Estelle", "Kai", "Evelyn",
            "Kian", "Flora", "Kingston", "Freya", "Leon", "Genevieve", "Levi", "Giselle", "Luca", "Hazel"};

    public GenerateSubjects(int sNum) {
        Random random = new Random();
        subjectNumber = sNum;
        subjects = new Subject[sNum];
        for (int i = 0; i < subjectNumber; i++) {
            int age = Constants.logicConstants.minimumAge + random.nextInt(Constants.logicConstants.ageVariance);
            int contactListSize = Constants.logicConstants.minimumContactListSize + random.nextInt(Constants.logicConstants.contactListVariance);
            int nameIndex = random.nextInt(100);
            while (isInArray(subjectNames[nameIndex], i))
                nameIndex = random.nextInt(100);
            Subject s = new Subject(subjectNames[nameIndex], age, contactListSize);
            subjects[i] = s;
        }
    }
    public boolean isInArray(String value, int index) {
        for (int i = 0; i < index; i++) {
            if (subjects[i].name.equals(value))
                return true;
        }
        return false;
    }
    public Subject[] getSubjects() {
        return subjects;
    }
}
