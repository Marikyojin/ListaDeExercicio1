package empresa;

public class Gerente extends Empregado {
	private String departamento;

	public Gerente(String nome, Float salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente: nome = " + getNome()+", departamento = " + departamento + ", salario = " + salario;
	}


	
	
}
