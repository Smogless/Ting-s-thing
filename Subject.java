import java.util.Random;
public class Subject {
    int age;
    int contactListSize;
    String name;
    String location;
    String[] names = {"James", "Mary", "Michael", "Patricia", "Robert", "Jennifer", "John", "Linda", "David", "Elizabeth",
            "William", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Karen", "Christopher",
            "Sarah", "Charles", "Lisa", "Daniel", "Nancy", "Matthew", "Sandra", "Anthony", "Betty", "Mark",
            "Ashley", "Donald", "Emily", "Steven", "Kimberly", "Andrew", "Margaret", "Paul", "Donna",
            "Joshua", "Michelle", "Kenneth", "Carol", "Kevin", "Amanda", "Brian", "Melissa", "Timothy",
            "Deborah", "Ronald", "Stephanie", "George", "Rebecca", "Jason", "Sharon", "Edward", "Laura",
            "Jeffrey", "Cynthia", "Ryan", "Dorothy", "Jacob", "Amy", "Nicholas", "Kathleen", "Gary",
            "Angela", "Eric", "Shirley", "Jonathan", "Emma", "Stephen", "Brenda", "Larry", "Pamela",
            "Justin", "Nicole", "Scott", "Anna", "Brandon", "Samantha", "Benjamin", "Katherine",
            "Samuel", "Christine", "Gregory", "Debra", "Alexander", "Rachel", "Patrick", "Carolyn",
            "Frank", "Janet", "Raymond", "Maria", "Jack", "Olivia", "Dennis", "Heather", "Jerry",
            "Helen", "Tyler", "Catherine", "Aaron", "Diane", "Jose", "Julie", "Adam", "Victoria",
            "Nathan", "Joyce", "Henry", "Lauren", "Zachary", "Kelly", "Douglas", "Christina", "Peter",
            "Ruth", "Kyle", "Joan", "Noah", "Virginia", "Ethan", "Judith", "Jeremy", "Evelyn",
            "Christian", "Hannah", "Walter", "Andrea", "Keith", "Megan", "Austin", "Cheryl",
            "Roger", "Jacqueline", "Terry", "Madison", "Sean", "Teresa", "Gerald", "Abigail", "Carl",
            "Sophia", "Dylan", "Martha", "Harold", "Sara", "Jordan", "Gloria", "Jesse", "Janice",
            "Bryan", "Kathryn", "Lawrence", "Ann", "Arthur", "Isabella", "Gabriel", "Judy",
            "Bruce", "Charlotte", "Logan", "Julia", "Billy", "Grace", "Joe", "Amber", "Alan",
            "Alice", "Juan", "Jean", "Elijah", "Denise", "Willie", "Frances", "Albert",
            "Danielle", "Wayne", "Marilyn", "Randy", "Natalie", "Mason", "Beverly",
            "Vincent", "Diana", "Liam", "Brittany", "Roy", "Theresa", "Bobby", "Kayla",
            "Caleb", "Alexis", "Bradley", "Doris", "Russell", "Lori", "Lucas", "Tiffany"};
    String[] tips = {"Drink more water!", "Eat a light snack.", "Rest in a safe place.", "Avoid caffeine.",
            "Stop drinking immediately.", "Take deep breaths.", "Sip electrolyte drinks.", "Lie down if dizzy.",
            "Stay with a friend.", "Don’t drive!", "Monitor your symptoms.", "Avoid cold showers.",
            "Drink broth or soup.", "Stretch gently.", "Take small sips of water.", "Avoid sugary drinks.",
            "Keep the room cool.", "Use a damp towel on your forehead.", "Don’t take acetaminophen.",
            "Try bland foods like toast.", "Sit up to prevent choking.", "Stay away from screens.",
            "Avoid smoking.", "Don’t mix with medication.", "Listen to calming music.",
            "If severe, seek medical help!", "Get fresh air.", "Hydrate with coconut water.", "Avoid greasy foods.",
            "Give your body time to recover."};
    String[] locations = {"123 Maple Street", "456 Oak Avenue", "789 Pine Road", "101 Birch Lane", "202 Cedar Drive", "303 Elm Court", "404 Spruce Way", "505 Willow Terrace", "606 Aspen Circle", "707 Redwood Boulevard",
            "808 Chestnut Drive", "909 Sycamore Street", "111 Poplar Road", "222 Dogwood Lane", "333 Magnolia Court", "444 Cypress Way", "555 Alder Circle", "666 Juniper Drive", "777 Sequoia Street", "888 Hickory Avenue",
            "999 Laurel Road", "112 Beech Lane", "223 Cottonwood Court", "334 Mulberry Way", "445 Hazel Terrace", "556 Fir Circle", "667 Larch Drive", "778 Mahogany Street", "889 Yew Avenue", "990 Tamarack Road",
            "121 Holly Lane", "232 Bayberry Court", "343 Elderberry Way", "454 Bluebell Terrace", "565 Buttercup Circle", "676 Clover Drive", "787 Dandelion Street", "898 Foxglove Avenue", "909 Gardenia Road", "1010 Ivy Lane"};
    String[] contactList; //each person's emergency contact list
    public Subject(String n, int a, int  c) {
        name = n;
        age = a;
        contactListSize = c;
        contactList = new String[contactListSize];
        addContacts();
        addLocation();
    }

    public void addLocation() {
        Random random = new Random();
        int index = random.nextInt(39);
        location = locations[index];
    }

    public void printLocation() {
        System.out.println(Constants.colorConstants.BRIGHT_YELLOW + name + "'s address is: " + location);
        System.out.println("Go help them out!" + Constants.colorConstants.RESET);
    }
    public boolean isInArray(String value, int index) {
        for (int i = 0; i < index; i++) {
            if (contactList[i].equals(value))
                return true;
        }
        return false;
    }
    public void addContacts() {
        Random random = new Random();
        contactList = new String[contactListSize];
       // int[] contactIndices = new int[contactListSize];
        for (int i = 0; i < contactListSize; i++) {
            int index = random.nextInt(200);
            while (isInArray(names[index], i))
                index = random.nextInt(200);
            contactList[i] = names[index];
        }
    }
    public void messageEmergencyContacts() {
        for (String s : contactList) {
            System.out.println("Calling " + s + "...");
        }
    }
    public void printHelpfulTips() {
        Random random = new Random();
        int index =random.nextInt(29);
        System.out.println(Constants.colorConstants.BLUE + "HELPFUL TIP: " + tips[index] + Constants.colorConstants.RESET);
    }
}
