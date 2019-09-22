package homework1;

public class Weight {
    public static double weightOnMoon;
    public static int myWeight;

    public Weight(int weight) {
        myWeight = weight;
        weightOnMoon = getWeightOnMoon();
    }

    private static double getWeightOnMoon() {
        int gravityOnTheMoon = 16;
        double weightOnMoon;
        weightOnMoon = myWeight * (1 - (double) gravityOnTheMoon / 100);
        return weightOnMoon;
    }
}
