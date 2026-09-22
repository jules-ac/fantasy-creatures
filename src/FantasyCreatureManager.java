public class FantasyCreatureManager {


    public static void displayPowerLevels(int[] arr) {
        for (int power : arr) {
            System.out.println(power);
        }
    }
    public static void displayCreaturePowers(String[] crs, int[] pws) {
        for (int i=0;i<crs.length;i++) {
            System.out.println(crs[i] + " - " + pws[i]);
        }
    }
    public static int getStrongestPower(int[] arr) {
        int strongest = arr[0];
        for (int power : arr) {
            if (power > strongest) {
                strongest = power;
            }
        } return strongest;
    }
    public static int getWeakestPower(int[] arr) {
        int weakest = arr[0];
        for (int power : arr) {
            if (power < weakest) {
                weakest = power;
            }
        } return weakest;
    }
    public static int getTotal(int[] arr) {
        int totalPower = 0;
        for (int power : arr) {
            totalPower += power;
        } return totalPower;
    }
    public static int getAboveFiftyCount(int[] arr) {
        int aboveFifty = 0;
        for (int power : arr) {
            if (power>50) { aboveFifty++; }
        } return aboveFifty;
    }
    public static String getStrongestCreature(String[] crs, int[] pws) {
        int strongestPower = getStrongestPower(pws);
        String strongestCreature = "";
        for (int i=0;i<pws.length;i++){
            if (pws[i] == strongestPower) {
                strongestCreature = crs[i];
                break;
            }
        } return strongestCreature;
    }
    public static String getWeakestCreature(String[] crs, int[] pws) {
        int weakestPower = getWeakestPower(pws);
        String weakestCreature = "";
        for (int i=0;i<pws.length;i++) {
            if (pws[i] == weakestPower) {
                weakestCreature = crs[i];
                break;
            }
        } return weakestCreature;
    }
    public static void main(String[] args) {

        // part 1: creature power levels
        int[] powers = {45, 80, 32, 95, 60};
        String[] creatures = {"Dragon", "Goblin", "Phoenix", "Golem", "Unicorn" };

        System.out.println("Power Levels:");
        displayPowerLevels(powers);

        System.out.println("\nTotal Power: " + getTotal(powers));
        System.out.println("Strongest Power: " + getStrongestPower(powers));
        System.out.println("Weakest Power: " + getWeakestPower(powers));
        System.out.println("Creatures Above 50 Power: " + getAboveFiftyCount(powers));

        // part 2: creature names
        System.out.print("\n");
        displayCreaturePowers(creatures, powers);

        System.out.println("\nStrongest Creature: " + getStrongestCreature(creatures, powers) + " (" + getStrongestPower(powers) + ")");
        System.out.println("Weakest Creature: " + getWeakestCreature(creatures, powers) + " (" + getWeakestPower(powers) + ")");
    }
}