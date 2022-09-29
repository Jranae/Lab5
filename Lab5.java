import java.util.Random;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		int randnum = generator.nextInt(4,20)+ 1;
		System.out.println("Rand Number : " + randnum);
	}

}
