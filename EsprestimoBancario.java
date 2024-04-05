package exercicioAula04;
import java.util.Scanner;

public class EsprestimoBancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite o valor que pretendes emprestar: ");
	    double valorPorEmprestar = entrada.nextFloat();
	    
	    System.out.println("Digite o tempo que pretende levar para pagar: ");
	    double tempoParaPagar = entrada.nextInt();
	    System.out.println("O valor final a ser pago será: " + valorFinal(valorPorEmprestar, tempoParaPagar));
	    

	}
	 public static double valorFinal(double valor, double tempo) {
		 return (valor * (Math.pow((1 + 0.02), tempo)));
	 }

}
