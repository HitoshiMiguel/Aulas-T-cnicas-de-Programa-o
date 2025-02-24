package Aula01;
import java.util.Scanner;
public class TesteFuncionario {

	public static void main(String[] args) {
	
	Funcionario f = new Funcionario();
	f.cargo = "gerente";
	f.codigoFunc = 177;
	f.nome = "Manoel";	
	f.salarioBruto = 4000;
	f.inss = 0.10;
	Scanner ler = new Scanner(System.in);
	
	double desc;
	System.out.println("Insira o desconto do INSS:");
	desc = ler.nextDouble();
	
	System.out.println(f.mostrarDados());
	double total = f.calculaSalarioLiquido(0);
	System.out.println("\n Salario Liquido:"+total);
		

	}

}
