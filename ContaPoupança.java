	public class ContaPoupan�a extends conta {
		public void imprimirExtrato() {
			System.out.println("===extrato conta poupan�a===");
			imprimirinfoscomuns();
			}

		protected void imprimirinfoscomuns() {
			System.out.println(String.format("Agencia: %d", super.agencia));
			System.out.println(String.format("conta: %d", super.numero));
			System.out.println(String.format("saldo: %.2f", super.saldo));
		}
		}	

	

