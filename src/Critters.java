public class Critters {

    public static void displayPowers(int[] arr) {
        for (int power : arr) {
            System.out.println(power);
        }
    }
    public static void displayCritterPowers(String[] crs, int[] pws) {
        for (int i=0;i<crs.length;i++) {
            System.out.println(crs[i] + " - " + pws[i]);
        }
    }
    public static int getStrongest(int[] arr) {
        int strongest = arr[0];
        for (int power : arr) {
            if (power > strongest) {
                strongest = power;
            }
        } return strongest;
    }
    public static int getWeakest(int[] arr) {
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

    public static void main(String[] args) {

        // part 1: creature power levels
        int[] powers = {55, 90, 42, 31, 86};
        String[] creatures = {"Dragon", "Pegasus", "Phoenix", "Ogre", "Unicorn" };

        System.out.println("Power Levels:");
        displayPowers(powers);

        System.out.println("\nTotal Power: " + getTotal(powers));

        System.out.println("Strongest Power: " + getStrongest(powers));

        System.out.println("Weakest Power: " + getWeakest(powers));

        System.out.println("Creatures Above 50 Power: " + getAboveFiftyCount(powers));

        // part 2: creature names
        System.out.print("\n");
        displayCritterPowers(creatures, powers);
    }
}