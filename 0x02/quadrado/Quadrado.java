public class Quadrado {

	public static double area(double lado) throws Exception {
		if (lado > 0) {
			return lado * lado;
		}
		throw new IllegalArgumentException ("Lado deve possuir valor positivo");
	}
	
}
