package Aula01;

public class Produto 
{
	public int codigo;
	public String nome;
	public double valor;
	
	public String mostrarDados()
	{
		return ("\n Produto:" +this.nome +" Código:" +this.codigo +" Valor R$:" +this.valor);
	}
	
	public double calcularTotal(int quant)
	{
		return (quant * this.valor);
	}
}


