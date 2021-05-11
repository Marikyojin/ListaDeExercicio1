package empresa;

public abstract class Empregado {
       private String nome;
       protected Float salario;
	
       public Empregado(String nome, Float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado: nome = " + nome + ", salario = " + salario;
	}
       
       
}
