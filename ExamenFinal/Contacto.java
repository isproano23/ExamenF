package ExamenFinal;

public class Contacto {
    
    String nombre;
    String cuentaDestino;
    String banco;
    boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco) {
        this.nombre = nombre;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;
        this.favorito = false;
    }

    public void mostrarContacto() {
        System.out.println("=== Contacto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cuenta: " + cuentaDestino);
        System.out.println("Banco: " + banco);
        System.out.println("Favorito: " + (favorito ? "⭐ Favorito" : "Sin marcar"));
    }

    public void marcarFavorito() {
        favorito = true;
        System.out.println(nombre + " agregado a favoritos. ⭐");
    }

    public void enviarDinero(double monto) {
        System.out.println("Transferencia enviada:");
        System.out.println("Destinatario: " + nombre);
        System.out.println("Cuenta: " + cuentaDestino);
        System.out.println("Monto: $" + monto);
    }


    
}
