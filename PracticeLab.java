import java.text.NumberFormat;
import java.util.Locale;
public class PracticeLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NumberFormat n1 = NumberFormat.getCurrencyInstance();
		System.out.println("Oil Price of Kentucky is : " + n1.format(2.99));
		NumberFormat n2 = NumberFormat.getPercentInstance();
		System.out.println("Percent : " + n2.format(.10));
	}

}
