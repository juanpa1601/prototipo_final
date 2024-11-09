package Models;

import Models.Interfaces.InterfaceUsuario;
import java.util.ArrayList;

public abstract class GestorUsuario implements InterfaceUsuario {

    protected ArrayList<Usuario> usuarios_sistema = new ArrayList<>();

    @Override
    public boolean login(String correo, String contrasena) {
        for (Usuario usuario : usuarios_sistema) {
            if (usuario.correo_usuario.equals(correo) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;        
    }

    @Override
    public void logout() {
        System.out.println("Sesión cerrada");
    }

    @Override
    public void recuperarConstrasena(String corre, String contrasena_nueva) {
        for (Usuario usuario : usuarios_sistema) {
            if (usuario.correo_usuario.equals(corre)) {
                usuario.setContrasena(contrasena_nueva);
                System.out.println("Contraseña actualizada.");
            }
        }
    }

    public void registrarUsuario(LectorAutor nuevoLectorAutor) {
        usuarios_sistema.add(nuevoLectorAutor);
    }
} 
