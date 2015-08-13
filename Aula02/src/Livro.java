import java.util.Scanner;

public class Livro {

	public String nome;
	public String isbn;
	public double valor;
	public String descricao;
	
	public void ler(){
		Scanner tc = new Scanner(System.in);
		System.out.println("Digite nome do livro");
		this.nome=tc.next();
	//	System.out.println("Digite descricao do livro");
	//	this.descricao = tc.next();	
		System.out.println("Digite valor do livro");
		this.valor=tc.nextDouble();
	//	System.out.println("Digite isbn do livro");
	//	this.isbn=tc.next();
	}
	
	public void mostrar(){
	//	System.out.println(this.descricao);
		System.out.println( "Nome livro" +this.nome);
		System.out.println("Valor:"+ this.valor);
	//	System.out.println(this.isbn);
	}
	
	public double desconto(double por){
		double descontoAplicado = this.valor* por;
		this.valor -= this.valor* por;
		return descontoAplicado;
		//System.out.println(this.nome +" recebeu "+ descontoAplicado );
	}
}
