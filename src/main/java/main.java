import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите расход топлива: ");
        double fuelConsumption=scan.nextDouble(); //consumption per 100 km
        System.out.print("Введите объем бака: ");
        double fuelVolume=scan.nextDouble(); //volume in liter
        double distanceToEnd=fuelVolume/fuelConsumption;
        System.out.println("Расстояние: "+distanceToEnd);
    }
}
