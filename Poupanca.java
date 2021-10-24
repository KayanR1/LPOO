package Avaliacao1;

public class Poupanca extends Conta{
	
	final double juros = 4.37;

	public Poupanca(int Numero, banco Banco, Clientes Cliente, double Saldo) {
		super(Numero, Banco, Cliente, Saldo);
	}

   public double getJuros() {
	   return juros;
   }
   
   public double RenderJuros() {
	   
	   return super.getSaldo()+super.getSaldo()*(this.juros/100);
	}

}
