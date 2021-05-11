package data;

public class TestarData {

	public static void main(String[] args) {
		Data d1 = new Data (10,05,2021);
		Data d2 = new Data (10,05,2030);
		Data d3 = new Data (29,02,2020);
		Data d4 = new Data (29,02,2021);
		Data d5 = new Data (31,05,2021);
		Data d6 = new Data (32,05,2021);
		Data d7 = new Data (30,04,2021);
		Data d8 = new Data (31,12,2021);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		
		System.out.println(d1.diaSeguinte(d1));
		System.out.println(d2.diaSeguinte(d2));
		System.out.println(d3.diaSeguinte(d3));
		System.out.println(d5.diaSeguinte(d5));
		System.out.println(d7.diaSeguinte(d7));
		System.out.println(d8.diaSeguinte(d8));
	

	}

}
