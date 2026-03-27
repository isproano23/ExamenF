package ExamenFinal;

public class Main {
    public static void main(String[] args) {
 System.out.println("===== Billetera Digital =====");
 System.out.println();
 // ── Integrante 1: Billetera ─────────────────────────────────
 // Crear una instancia de Billetera con datos reales.
 // Llamar a: mostrarInfo(), depositar() y retirar().
 // ── Integrante 2: Transaccion ───────────────────────────────
 // Crear una instancia de Transaccion con datos reales.
 // Llamar a: mostrarDetalle(), aplicarComision() y marcarFallida().
Transaccion transaccion = new Transaccion("TRANSFERENCIA", 75.00, "Pago de servicio");
    transaccion.mostrarDetalle();     
    transaccion.aplicarComision(2.5); 
    transaccion.marcarFallida();       
    System.out.println("===========================");

 // ── Integrante 3: Contacto ──────────────────────────────────
 // Crear una instancia de Contacto con datos reales.
 // Llamar a: mostrarContacto(), marcarFavorito() y enviarDinero().
 // ── Integrante 4 (si aplica): RegistroBilletera ─────────────
 // Crear una instancia de RegistroBilletera.
 // Registrar al menos 2 billeteras con registrarBilletera().
 // Llamar a buscarCuenta() y mostrarRegistro().
 System.out.println();
 System.out.println("===== Fin del sistema =====");
 }

}
