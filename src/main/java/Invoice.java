import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of kilometers");
        int totalDistanceInKm=input.nextInt();
        FareCalculator fareCalculator=new FareCalculator(totalDistanceInKm);
        System.out.println("Total fare:"+fareCalculator.calculate());
    }
}
