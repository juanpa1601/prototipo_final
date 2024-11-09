package Models.Interfaces;

public interface InterfaceUsuario {
    boolean login(String correo, String contrasena);
    void logout();
    void recuperarConstrasena(String correo, String contrasena_nueva);
}
