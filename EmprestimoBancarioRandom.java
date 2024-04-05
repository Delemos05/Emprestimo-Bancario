package exercicioAula04;
import java.util.Random;

public class EmprestimoBancarioRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		double valor = r.nextFloat(1000) + 1000;
		int tempo = r.nextInt(12);
		System.out.println("O valor Final será: " + valorFinal(valor, tempo));

	}
	
	 public static double valorFinal(double valor, double tempo) {
		 return (valor * (Math.pow((1 + 0.02), tempo)));
	 }

}
