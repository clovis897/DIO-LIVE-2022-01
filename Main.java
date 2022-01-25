
public class Main {
public static void main(String[] args) {
	conta CC = new contaCorrente();
	conta poupança = new ContaPoupança();
	
	CC.imprimirExtrato();
	poupança.imprimirExtrato();
}
}
