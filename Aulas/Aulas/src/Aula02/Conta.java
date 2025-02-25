package Aula02;

//atributos
public class Conta {
public double saldo;
public Cliente titular = new Cliente();
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
			+"\n Titular: " + this.titular.nome 
			+ "\n CPF: " + this.titular.cpf
			+"\n Celular: " + this.titular.celular
			+"\n Email: " + this.titular.email
			+ "\n Número: " + this.numero);
}



public void setTitular(String titular)
{
	this.titular.nome = titular;
}

public String getTitular()
{
	return this.titular.nome;
}


public void setNumero(int numero)
{
	this.numero = numero;
}

public boolean transferir(double v, Conta outra)
{
	if(this.sacar(v))
	{
		outra.depositar(v);
		return true;
	}
	else {
		return false;
	}
}
}