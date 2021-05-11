package empresa;

public class Vendedor extends Empregado {
       private Float percentualComissao;

	public Vendedor(String nome, Float salario, Float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}

	public Float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(Float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public Float salarioTotal() {
		salario= salario + salario*percentualComissao;
		return salario;
	}

	@Override
	public String toString() {
		return "Vendedor: Nome = " + getNome() + ", salario = " + salario
				+", percentualComissao = " + percentualComissao +", salario ascrecido da comissão "+ salarioTotal() ;
	}

 
       
}
