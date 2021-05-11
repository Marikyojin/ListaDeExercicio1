package firma;

public class Empregado {
       private String nome,sobrenome;
       private double salarioMensal;
	
       public Empregado(String nome, String sobrenome, double salarioMensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	
//	  if(salarioMensal<=0) { 
//		 salarioMensal= 0.00;}
//	  
	  
// 
//		public double getSalarioMensal() {
//			return salarioMensal;
//		}
//	
//	if(getSalarioMensal()<=0) {
//		  public void setSalarioMensal(double salarioMensal) {
//			  this.salarioMensal= 0.00;
//		  }
//		  else {
//			  this.salarioMensal = salarioMensal;
//		  }
//	  }
	
//	public void setSalarioMensal(double salarioMensal) {
//		if (salarioMensal<=0) {
//			this.salarioMensal= 0.00;
//		}
//		else {
//		    this.salarioMensal = salarioMensal;
//		}
	
	public double getSalarioMensal() {
		if(salarioMensal<=0) {
			return 0.0;
		}
		return salarioMensal;
	}
	}
	

       
       

