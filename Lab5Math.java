import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab5Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance, root1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter X1: ");
		double X1= scan.nextDouble();
		System.out.println("Enter X2: ");
		double X2 = scan.nextDouble();
		System.out.println("Enter Y1: ");
		double Y1= scan.nextDouble();
		System.out.println("Enter Y2: ");
		double Y2= scan.nextDouble();
		
		distance = Math.sqrt((Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2)));

		System.out.println("Distance is : " + distance);
		DecimalFormat format1 = new DecimalFormat("0.##");
	
		System.out.println("Enter distance [12.0, 24.0] and [67.0, 89.0] : " + format1.format(distance));
	}

}
