import java.util.Scanner;

public class fuelConsumption {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the amount of fuel available: ");
        double fuelVolume=scan.nextDouble(); //volume in liter
        System.out.print("Fuel consumption: ");
        double fuelConsumption=scan.nextDouble(); //consumption liter per 100 km
        double distanceToEnd=(fuelVolume/fuelConsumption)*100;
        int roundedValueDistanceToEnd=(int)distanceToEnd;
        System.out.println("Distance: "+roundedValueDistanceToEnd);
    }
}
