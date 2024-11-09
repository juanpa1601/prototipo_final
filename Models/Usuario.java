package Models;

public class Usuario {
    int usuario_id;
    String nombre_completo;
    String correo_usuario;
    private String contrasena_usuario;

    //Constructor
    public Usuario(int usuario_id, String nombre_completo, String correo_usuario, String contrasena_usuario) {
        this.usuario_id = usuario_id;
        this.nombre_completo = nombre_completo;
        this.correo_usuario = correo_usuario;
        this.contrasena_usuario = contrasena_usuario;
    }

    //Getters
    public String getContrasena() {
        return contrasena_usuario;
    }

    //Setters
    public void setContrasena(String contrasena) {
        this.contrasena_usuario = contrasena;
    }
}