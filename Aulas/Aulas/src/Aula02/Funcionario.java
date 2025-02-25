package Aula02;

//atributos
public class Funcionario {
public String nome;
public String rg;
public String departamento;
public double salario;
public String dataEntrada;

//metodos

public double recebeAumento(double aumento)
	{
		return this.salario * aumento/100;
	}
public double calculaGanhoAnual(double v)
	{
		return this.salario * 12;
	}
}

