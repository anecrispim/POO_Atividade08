package classes;

public class ContaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta, saldo);
	}
	
	public ContaEspecial() {
		
	}
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0) {
			this.diasSemJuros = diasSemJuros;
		}
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
