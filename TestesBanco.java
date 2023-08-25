import java.util.Scanner;
public class TestesBanco {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Banco contaBancaria = new Banco();
		
		System.out.println("Informe o numero da conta: ");
		contaBancaria.numeroConta = ler.nextInt();
		int op;
		do{
		System.out.println("=========Digite uma opcao=========");
		System.out.println("1 - Deposito");
		System.out.println("2 - Saque");
		System.out.println("3 - Extrato");
		System.out.println("0 - sair");
		System.out.println("==================================");
		op = ler.nextInt();
		
		
		switch(op) {
		case 1 : contaBancaria.Depositar(); break;
		case 2 : contaBancaria.Sacar(); break;
		case 3 : contaBancaria.Extrato(); break;
		case 0 : break;
		default : System.out.println("Selecione uma opcao valida.");
		}
		
		}while(op!=0);	
		
	}
}	

		

	


