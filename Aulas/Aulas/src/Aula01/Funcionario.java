package Aula01;

public class Funcionario 
{
	public int codigoFunc;
	public String nome;
	public String cargo;
	public double salarioBruto;
	public double inss;
	public double salarioLiquido;
	
	
	
	public String mostrarDados()
	{
		return("\n Codigo:" +this.codigoFunc + " Nome:"+ this.nome + " Cargo:"+this.cargo + " Salario Bruto:"+this.salarioBruto);
	}
	
	public double calculaSalarioLiquido(double percentualDescontoINSS) 
	{
		return (this.salarioBruto - (this.salarioBruto * inss));
	}
	
}
