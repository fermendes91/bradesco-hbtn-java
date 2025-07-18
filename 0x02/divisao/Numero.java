public class Numero {
	
	public static void dividir(int a, int b) {
		int divisao = 0;
		try {
			if (b == 0) throw new Exception("Nao eh possivel dividir por zero");
			divisao = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(a + " / " + b + " = " + divisao);
		}
	}

}
