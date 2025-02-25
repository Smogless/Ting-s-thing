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
            int age = 21 + random.nextInt(79);
            int contactListSize = 10 + random.nextInt(10);
            int nameIndex = random.nextInt(100);
            while (isInArray(subjectNames[nameIndex]))
                nameIndex = random.nextInt(100);
            Subject s = new Subject(subjectNames[nameIndex], age, contactListSize);
            subjects[i] = s;
        }
    }
    public boolean isInArray(String value) {
        for (int i = 0; i < subjectNumber; i++) {
            if (subjects[i].equals(value))
                return false;
        }
        return true;
    }
    public Subject[] getSubjects() {
        return subjects;
    }
}
