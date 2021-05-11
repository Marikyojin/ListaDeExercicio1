package data;

import java.time.Year;

public class Data {
       private int dia,mes,ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	

	public int getDia() {
	      if (Year.isLeap(ano)==true & mes==2 & dia >29)	{
	    		System.out.print("Dia inválido");
	    		return 0;
	    	}
	       else if (Year.isLeap(ano)==false & mes==2 & dia >28) {
	    		System.out.print("Dia inválido");
	    		return 0;
	    	}
	      else if ((mes==1 | mes==3 | mes==5 | mes==7 | mes==8 |mes==10 |mes==12) & dia>31) {
	    		System.out.print("Dia inválido");
	    		return 0;
	    	}
	      else if ((mes==4 | mes==6 | mes==9 | mes==11) & dia>30) {
	    		System.out.print("Dia inválido");
	    		return 0;
	    	}
	      else {
		        return dia;
	      }
	}

	public int getMes() {
    	if(mes>12) {
	    	System.out.print("Mês inválido");
	    	return 0;
	    	}
    	else {
		    return mes;
	    }
	}

	public int getAno() {
		return ano;
	}

 //   public void mesInvalido (int mes){
//    	if(mes>12) {
//    		System.out.print("Mês inválido");
//    	}
//    }
 //   public void diainvalido (int dia) {
//      if (Year.isLeap(ano)==true & mes==2 & dia >29)	{
//    		System.out.print("Dia inválido");
//    	}
//    	else if (Year.isLeap(ano)==false & mes==2 & dia >28) {
//    		System.out.print("Dia inválido");
//    	}
//      
//      else if ((mes==1 | mes==3 | mes==5 | mes==7 | mes==8 |mes==10 |mes==12) & dia>31) {
//    		System.out.print("Dia inválido");
//    	}
//      else if ((mes==4 | mes==6 | mes==9 | mes==11) & dia>30) {
//    		System.out.print("Dia inválido");
//    	}

//    }


	@Override
	public String toString() {
		return  getDia() + "/" + getMes() + "/" + getAno();
	
	}
	public Data diaSeguinte(Data data) {
		if (Year.isLeap(ano)==true & mes==2 & dia ==29)	{
    		mes=mes+1;
    		dia=1;
    		return data;
    	}
       else if (Year.isLeap(ano)==false & mes==2 & dia ==28) {
    		mes=mes+1;
    		dia=1;
    		return data;
    	}
      else if ((mes==1 | mes==3 | mes==5 | mes==7 | mes==8 |mes==10) & dia==31) {
    		mes=mes+1;
    		dia=1;
    		return data;
    	}
      else if ((mes==4 | mes==6 | mes==9 | mes==11) & dia==30) {
    		mes=mes+1;
    		dia=1;
    		return data;
    	}
      else if (mes==12 & dia==31) {
    	  dia=1;
    	  mes=1;
    	  ano = ano+1;
    	  return data;
      }
      else {
    	  dia=dia+1;
	        return data;
	  }
	}


}
