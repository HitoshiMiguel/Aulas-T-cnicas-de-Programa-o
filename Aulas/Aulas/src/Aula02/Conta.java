package Aula02;

//atributos
public class Conta {
public double saldo;
public String titular;
public int numero;

//métodos

public void depositar(double v)
{
	this.saldo += v;
}

public boolean sacar(double v)
{
	if(this.saldo >= v)
	{
		this.saldo -= v;
		return true;

	}
	else
	{
		return false;
	}
}

public String consultar()
{
	return ("\n Saldo: R$" + this.saldo 
			+"\n Titular: " + this.titular 
			+ "\n Número: " + this.numero);
}



public void setTitular(String titular)
{
	this.titular = titular;
}

public String getTitular()
{
	return this.titular;
}


public void setNumero(int numero)
{
	this.numero = numero;
}
}