import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {	
		//Livro l1 = new Livro(); 
		//Livro l2 = new Livro(); 
		//l1.ler();
		//l1.mostrar();
		//double d=l1.desconto(0.3);
		//System.out.println("Aplicado desconto de:" +d );
		//l1.mostrar();
		
		Hora h1 = new Hora();
		boolean valida=h1.setarHoras(0, 0, 0);
		if(valida){
			System.out.println("Hora criada com sucesso");
		}
		valida= h1.setarHoras("23:59:00");
		if(valida){
			System.out.println("Segunda Hora criada com sucesso");
			
		}
		
	}

}
