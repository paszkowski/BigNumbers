package asd;

import java.math.BigDecimal;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dzialanie na duzych liczbach");
		double a = 0.7;
		double b = 0.3;
		
		System.out.println("a - b =  " + (a-b) );
		
		BigDecimal number1 = BigDecimal.valueOf(a);
		BigDecimal number2 = BigDecimal.valueOf(b);
		
		System.out.println("Duze liczby wynik a-b = " + (number1.subtract(number2)));

	}

}
