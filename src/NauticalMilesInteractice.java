import java.util.Scanner;

public class NauticalMilesInteractice {

    public static void main(String[] args){
        final double NUM_OF_KM = 1.852;
        final double NUM_OF_MI = 1.150779;


        double km;
        double miles;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter nautical miles = >");
        double nauticalMiles = input.nextDouble();

        km = nauticalMiles * NUM_OF_KM;
        miles = nauticalMiles * NUM_OF_MI;

        System.out.println(nauticalMiles + " Nautical Miles equals " + km
                + " kilometers and " + miles + " Miles.");
    }
}
