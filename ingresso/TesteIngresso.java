package ingresso;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ig1= new Ingresso (500.00f);
		Ingresso ig2= new IngressoVIP (500.00f,200.00f);
		
		System.out.println(ig1);
		System.out.println(ig2);
		

	}

}
