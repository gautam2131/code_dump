public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);

    }

    public static long printConversion(double kilometerPerHour){

        if (kilometerPerHour<0){
            System.out.println("invalid Value");
        }
        System.out.println(kilometerPerHour + " km/h =" + toMilesPerHour(kilometerPerHour)
        + " mi/h");
        return 0;




    }

}
