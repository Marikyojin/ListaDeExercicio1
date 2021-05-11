package ingresso;

public class IngressoVIP extends Ingresso {
       private Float valorAdicional;

	public IngressoVIP(Float valor, Float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
       
       public IngressoVIP() {
    	   
       }

	public Float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "IngressoVIP = Ingresso + valorAdicional = " + (getValor()+ getValorAdicional());
	}
       
       
}
