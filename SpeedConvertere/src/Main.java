public class Main {
    public static void main(String[] args) {
        long kmsToMiles = SpeedConverter.toMilesPerHour(5);
        System.out.println("converted value is "+ kmsToMiles);

        long a=SpeedConverter.printConversion(5);
        System.out.println(a);
    }
}
