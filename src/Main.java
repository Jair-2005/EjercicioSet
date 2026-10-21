//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setNombreUsuario("jperez");
        u.setCorreo("jperez@correo.com");

        System.out.println("Prueba 1: contraseña corta");
        u.setContrasena("abc123");
        System.out.println("¿Se guardó? " + (u.getContrasena() != null));

        System.out.println("Prueba 2: contraseña válida");
        u.setContrasena("segura2026");
        System.out.println("¿Se guardó? " + (u.getContrasena() != null));

        u.mostrarDatos();
    }
}
