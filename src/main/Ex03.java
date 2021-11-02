package main;
import classes.Conta;
import classes.ContaSimples;
import classes.ContaEspecial;

public class Ex03 {

	public static void main(String[] args) {
		//conta
		
		Conta conta = new Conta("Banco do Brasil", 123, 321, 0);
		
		conta.deposito(1000);
		
		conta.saque(100);
		
		conta.saque(901);
		
		System.out.println(conta);
		
		//conta simples
		
		ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
		
		cs.depositoPoupanca(1000);
		
		cs.saquePoupanca(500);
		
		System.out.println(cs);
		
		// conta Especial
		
		ContaEspecial ce = new ContaEspecial("Itau", 789, 987, 200);
		
		ce.setDiasSemJuros(5);
		ce.setLimite(1000);
		
		System.out.println(ce);
	}
}
