package Aula02;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class TesteContaJOption {

	public static void main(String[] args) {
	Conta c = new Conta();
	int op, numero;
	String msg_ok, msg_erro, menu, escolha1, escolha2, escolha3, escolha4, escolha5, numeroConta;
	Scanner ler = new Scanner(System.in);
	c.saldo = 0;
	
	msg_ok = "\n Operação realizada com sucesso!";
	msg_erro = "\n Operação não realizada";
	menu = "\n Bem vindo ao Sistema Banco Fatec" + "\n 1- Atualizar Titular \n 2- Depositar \n 3- Sacar \n 4- Consultar \n 5- Sair" + "\n Digite a opção desejada: ";
	numeroConta = "\n Digite o número da sua conta do banco";
	escolha1 = "\n Você escolheu Atualizar o Titular da conta!";
	escolha2 = "\n Você escolheu realizar um depósito na conta!";
	escolha3 = "\n Você escolheu realizar um saque na conta!";
	escolha4 = "\n Você escolheu realizar uma consulta na conta!";
	
	// Menu de opções
	numero = Integer.parseInt(JOptionPane.showInputDialog(numeroConta));
	c.setNumero(numero);
	op = Integer.parseInt(JOptionPane.showInputDialog(menu));
	
	while(op != 5)
	{
		switch (op)
		{
			case 1:
			{
				JOptionPane.showMessageDialog(null, escolha1);
				
				String novoTitular = JOptionPane.showInputDialog("Digite o nome do novo titular da conta");
				
				if(novoTitular != null && !novoTitular.trim().isEmpty() && novoTitular.matches("[a-zA-Z]+"))
					{
						c.setTitular(novoTitular);
						JOptionPane.showMessageDialog(null, msg_ok);
					}
				else
					{
						JOptionPane.showMessageDialog(null, msg_erro);
					}
				
				
				break;
			
			
			}
			
			case 2:
			{
				JOptionPane.showMessageDialog(null, escolha2);
				String valorDeposito = JOptionPane.showInputDialog("Digite a quantidade em reais que será depositada na conta");
				
				double v = Double.parseDouble(valorDeposito);
				
				c.depositar(v);
				JOptionPane.showMessageDialog(null, msg_ok);
				
				break;
			
			}
			
			case 3:
			{
				JOptionPane.showMessageDialog(null, escolha3);
				String valorSaque = JOptionPane.showInputDialog("Digite a quantidade em reais que será sacada da conta");
				
				double v = Double.parseDouble(valorSaque);
				
				if (c.sacar(v))
				{
					JOptionPane.showMessageDialog(null, msg_ok);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, msg_erro);

				}
				
				break;
			}
			
			case 4:
			{
				JOptionPane.showMessageDialog(null, escolha4);
				JOptionPane.showMessageDialog(null, c.consultar());
				
				break;
			}
				
			case 5:
			{
				JOptionPane.showMessageDialog(null, "Saindo do sistema.");
				break;
			}
		

		}
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	

}
}
