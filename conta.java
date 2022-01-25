
public abstract class conta implements iconta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;

	public conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}

	public void sacar() {
	}
	public void depositar() {
		
		}
	public void transferir() {
		}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;

		}
	@Override
	public void sacar(double valor) {
		saldo =- valor;
		
	}
	@Override
	public void depositar(double valor) {
	saldo =+ valor;
		
	}
	@Override
	public void transferir(double valor, conta contadestino) {
	this.sacar(valor);
	contadestino.depositar(valor);
	}
	protected void imprimirinfoscomuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("conta: %d", this.numero));
		System.out.println(String.format("saldo: %.2f",
this.saldo));
	}
	}

