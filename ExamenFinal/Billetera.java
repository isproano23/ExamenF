package ExamenFinal;

public class Billetera {
    private String propietario;
	private String numeroCuenta;
	private double saldo;
	private boolean activa;
	
	public Billetera (String propietario, String numeroCuenta, double saldo, boolean activa) {
		this.propietario = propietario;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.activa = activa;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
  public void mostrarInfo() {
		
		System.out.println("Propietario: "+propietario+"Numero de Cuenta:"+numeroCuenta+"Saldo: "+saldo+"Estado:"+activa);
		
	}
	
  public double depositar(double monto) {
      saldo += monto;
      System.out.printf("Depósito exitoso: +$%.2f%n", monto);
      System.out.printf("Nuevo saldo: $%.2f%n", saldo);
      return saldo;
  }
  public double retirar(double monto) {
      if (monto <= saldo) {
          saldo -= monto;
          System.out.printf("Retiro exitoso: -$%.2f%n", monto);
          System.out.printf("Saldo restante: $%.2f%n", saldo);
      } else {
          System.out.println("--- --- ---");
          System.out.println("Fondos insuficientes.");
          System.out.printf("Saldo actual: $%.2f%n", saldo);
      }
      return saldo;
  }
	
    
}
