public class NauticalMiles {
    public static void main(String [] args){

        System.out.println("Please enter number of ");

            final double NUM_OF_KM = 1.852;
            final double NUM_OF_MI = 1.150779;

            double nauticalMiles = 100;

            double km;
            double miles;

            km = nauticalMiles * NUM_OF_KM;
            miles = nauticalMiles * NUM_OF_MI;

            System.out.println(nauticalMiles + " Nautical Miles equals " + km
                    + " kilometers and " + miles + " Miles.");




    }
}
