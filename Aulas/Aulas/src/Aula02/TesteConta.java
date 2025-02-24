package Aula02;
import javax.swing.JOptionPane;


public class TesteConta {


	public static void main(String[] args) {
	// Instanciar um objeto do tipo conta
		
	Conta c = new Conta();
	String msg_ok, msg_erro;
	msg_ok = "\n Operação realizada com sucesso!";
	msg_erro = "\n Operação não realizada";
	c.numero = 123;
	c.saldo = 500;
	c.titular = "José Santos";
	JOptionPane.showMessageDialog(null, "\n Saldo inicial " + c.saldo);
	System.out.println("\n Saldo Inicial R$" + c.saldo);
	if(c.sacar(2000))
	{
		JOptionPane.showMessageDialog(null, msg_ok);

	}
	else
	{
		JOptionPane.showMessageDialog(null, msg_erro);
	}

	JOptionPane.showMessageDialog(null, c.consultar());
	}

}
