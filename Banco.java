
import java.util.Scanner;
public class Banco {
	double saldo, valor;
	int numeroConta;
	String nomeTitular;
	
	public void Depositar(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor a ser depositado: ");
		valor = ler.nextDouble();
		saldo = saldo+valor;
		System.out.println("Valor de R$"+saldo+" depositado com sucesso!!");
		}
	public void Sacar(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor a ser sacado: ");
		valor = ler.nextDouble();
		
		if(valor > saldo) {
			System.out.println("Saldo insuficiente para saque!!");
		}else {
			this.saldo = saldo-valor;
			System.out.println("Saque de R$"+valor+" realizado com sucesso!!");
		}
}
	public void Extrato(){
		System.out.println("Numero da conta: "+numeroConta);
		System.out.println("Nome do titular: "+nomeTitular);
		System.out.println("Saldo da conta:"+saldo);
	}

}
