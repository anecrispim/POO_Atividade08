package main;
import classes.Pessoa;
import classes.PessoaFisica;
import classes.PessoaJuridica;

public class Ex01 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("joao", "Rua Brigadeiro");
		
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("joana", "Rua Sao Pedro", "12345678910", "s");
		
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("carol", "Rua Padre Feijó", "12345678910114", "MEI");
		
		System.out.println(pj);
	}

}
