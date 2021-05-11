package firma;

public class Teste {

	public static void main(String[] args) {
	       
		Empregado ep1 = new Empregado("Mariana","Sá",1500);
		Empregado ep2 = new Empregado("Waldete","da Silvassauro",-800);
		Empregado ep3 = new Empregado("Leo","Bundao",3000);
		
		
		
		System.out.println("Nome : " + ep1.getNome()+" sobrenome : "+ ep1.getSobrenome()+ 
			" \nSalário Anual: "+ 12*ep1.getSalarioMensal());
		System.out.println("Nome : " + ep2.getNome()+" sobrenome : "+ ep2.getSobrenome()+ 
				" \nSalário Anual: "+ 12*ep2.getSalarioMensal());
		System.out.println("Nome : " + ep3.getNome()+" sobrenome : "+ ep3.getSobrenome()+ 
				" \nSalário Anual: "+ 12*ep3.getSalarioMensal());
	

	}



}
