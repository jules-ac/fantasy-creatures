import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Creature {

    private String name = "";
    private int power = 0;

    // constructor
    public Creature(String n, int p) {
        name = n;
        power = p;
    }

    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }

    public static void displayPowerLevels(Creature[] crArr) {
        for (Creature cr : crArr) {
            System.out.println(cr.getName() + " - " + cr.getPower());
        }
    }

    public static int getStrongestPower(Creature[] crArr) {
        int strongestPower = crArr[0].getPower();
        for (int i=1;i<crArr.length;i++) {
            if (crArr[i].getPower() > strongestPower) {
                strongestPower = crArr[i].getPower();
            }
        } return strongestPower;
    }
    public static int getWeakestPower(Creature[] crArr) {
        int weakestPower = crArr[0].getPower();
        for (int i=1;i<crArr.length;i++) {
            if (crArr[i].getPower() < weakestPower) {
                weakestPower = crArr[i].getPower();
            }
        } return weakestPower;
    }

    public static String getStrongestCreature(Creature[] crArr) {
        String strongestCreature = "";
        int strongestPower = getStrongestPower(crArr);
        for (Creature cr : crArr) {
            if (cr.getPower() == strongestPower) {
                strongestCreature = cr.getName();
                break;
            }
        } return strongestCreature;
    }
    public static String getWeakestCreature(Creature[] crArr) {
        String weakestCreature = "";
        int weakestPower = getWeakestPower(crArr);
        for (Creature cr : crArr) {
            if (cr.getPower() == weakestPower) {
                weakestCreature = cr.getName();
                break;
            }
        } return weakestCreature;
    }

    public static void displayArrayListCreatures(ArrayList<Creature> arrl) {
        for (Creature cr : arrl) {
            System.out.println(cr.getName());
        }
    }

    public static void arrayListScan(ArrayList<Creature> arrl, Scanner scan) {
        String userSearch = "";
        System.out.print("\nSearch collection for a creature.\nEnter creature name: ");
        userSearch = scan.nextLine();
        userSearch = userSearch.substring(0,1).toUpperCase() + userSearch.substring(1).toLowerCase();
        for (Creature cr : arrl) {
            if (cr.getName().equals(userSearch)) {
                System.out.println(userSearch + " is in your collection!");
                return;
            }
        }
        System.out.println("Creature not found.");
    }

    public static void compareArrayLists(ArrayList<Creature> refArr, ArrayList<Creature> baseArr) {
        for (int i=0;i<refArr.size();i++) {
            for (int y=0;y<baseArr.size();y++) {
                if ((refArr.get(i)).getName().equals((baseArr.get(y)).getName())) {
                    System.out.println((refArr.get(i)).getName());
                }
            }
        }
    }

    public static void randomCreatureBossFight(ArrayList<Creature> arrl) {
        Random rand = new Random();
        int randomCreatureIndex = rand.nextInt(arrl.size());
        System.out.println("\nSelected Creature: " + arrl.get(randomCreatureIndex).getName());
        System.out.println("Power Level: " + arrl.get(randomCreatureIndex).getPower());
        if (arrl.get(randomCreatureIndex).getPower() <= 75 ) {
            System.out.println("Boss Wins!");
        } else {
            System.out.println("Boss Defeated!");
        }
    }

    // main method
    public static void main(String[] args) {

        Creature dragon = new Creature("Dragon",45);
        Creature goblin = new Creature("Goblin", 80);
        Creature phoenix = new Creature("Phoenix", 32);
        Creature golem = new Creature("Golem", 95);
        Creature unicorn = new Creature("Unicorn", 60);

        Creature[] creatureArr = {dragon, goblin, phoenix, golem, unicorn};

        displayPowerLevels(creatureArr);
        System.out.println("\nStrongest Creature: " + getStrongestCreature(creatureArr) + " (" + getStrongestPower(creatureArr) + ")");
        System.out.println("Weakest Creature: " + getWeakestCreature(creatureArr) + " (" + getWeakestPower(creatureArr) + ")");

        // part 4: ArrayList
        ArrayList<Creature> collection = new ArrayList<>();
        collection.add(dragon);
        collection.add(goblin);
        collection.add(phoenix);
        System.out.println("\nCurrent Collection:");
        displayArrayListCreatures(collection);

        Creature kraken = new Creature("Kraken", 88);
        Creature griffin = new Creature("Griffin", 59);
        collection.add(kraken);
        collection.add(griffin);

        collection.remove(goblin);

        System.out.println("\nUpdated Collection:");
        displayArrayListCreatures(collection);

        System.out.println("" + "\nTotal Creatures: " + collection.size());

        // part 5: creature search
        Scanner scan = new Scanner(System.in);
        arrayListScan(collection, scan);

        // part 6: rare creature challenge
        ArrayList<Creature> rareCreatures = new ArrayList<>();
        rareCreatures.add(dragon);
        rareCreatures.add(phoenix);
        rareCreatures.add(kraken);

        System.out.println("\nRare Creatures Found:");
        compareArrayLists(rareCreatures, collection);

        // bonus challenge: boss battle
        randomCreatureBossFight(collection);
    }
}
