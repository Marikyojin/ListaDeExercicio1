package ingresso;

public class Ingresso {
       private Float valor;

	public Ingresso(Float valor) {
		super();
		this.valor = valor;
	}
    public Ingresso () {
    	
    }
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Ingresso valor = " + valor;
	}
    
	
}
