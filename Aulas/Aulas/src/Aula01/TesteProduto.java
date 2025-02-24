package Aula01;

public class TesteProduto {

	public static void main(String[] args) {
	
	//instaciar um objeto do tipo produto
		
	Produto p = new Produto();
	p.codigo = 890;
	p.nome = "maça";
	p.valor = 2.50;
	
	System.out.println(p.mostrarDados());
	
	int quantidade = 10;
	double total = p.calcularTotal(quantidade);
	System.out.println("\n Total R$" + total);
	
	}

}
