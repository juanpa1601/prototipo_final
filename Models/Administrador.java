package Models;

public class Administrador extends Usuario {

    public Administrador(int usuario_id, String nombre_completo, String correo_usuario, String contrasena_usuario) {
        super(usuario_id, nombre_completo, correo_usuario, contrasena_usuario);
    }

    // Métodos específicos para el administrador
}