package Aula07;

public class Principal {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty B","França", 31,1.75,68.9,11,2,1);
		l[1] = new Lutador("Crenilson","Brasil",29,1.68,57.8,14,2,3);
		l[2] = new Lutador("Pietro","EUA",35,1.65,80.9,12,2,1);
		l[3] = new Lutador("Erick", "Australia",28,1.93,81.6,13,0,2);
		l[4] = new Lutador("CClovis", "Brasil",37,1.70,119.3,5,4,3);
		l[5] = new Lutador("Fernando", "l",30,1.81,105.7,12,2,4);
		
		
	
		
		          
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1] );
		UEC01.lutar();
		l[0].status();
		l[1].status();

	}

}
