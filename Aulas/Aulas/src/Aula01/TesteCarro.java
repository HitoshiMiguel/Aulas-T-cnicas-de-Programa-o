package Aula01;

public class TesteCarro {

	public static void main(String[] args) 
	{
		//Instanciar o objeto
		
		int x;
		Carro c1 = new Carro();
		c1.placa = "VSR-1234";
		System.out.print(c1.placa);
		
		System.out.print(c1.acelerar());
		
	}

}
