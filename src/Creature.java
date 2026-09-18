public class Creature {

    private String name = "";
    private int power = 0;

    public Creature(String n, int p) {
        name = n;
        power = p;
    }
    public static void main(String[] args) {
        Creature dragon = new Creature("Dragon",55);
        Creature pegasus = new Creature("Pegasus", 90);
        Creature phoenix = new Creature("Phoenix", 42);
        Creature ogre = new Creature("Ogre", 31);
        Creature unicorn = new Creature("Unicorn", 86);
        Creature[] critters = {dragon, pegasus, phoenix, ogre, unicorn};
    }
}
