import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length, root1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter A: ");
		double A = scan.nextDouble();
		System.out.println("Enter B: ");
		double B = scan.nextDouble();
		System.out.println("Enter C: ");
		double C = scan.nextDouble();
		
		double S = (A+B+C)/2;
		double area = Math.sqrt(S*(S-A)*(S-B)*(S-C));
		DecimalFormat format1 = new DecimalFormat("0.##");
		System.out.println("The Area is : " + format1.format(area));
		
	}

}
