package empresa;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empregado gerente=new Gerente ("Mariana",2500f,"RH");
		Empregado vendedor=new Vendedor ("Leo",1500f, 0.15f);
		
		System.out.println(gerente);
		System.out.println(vendedor);

	}

}
