package Models;

import Models.Interfaces.InterfaceLectorAutor;

public class GestorLectorAutor extends GestorUsuario implements InterfaceLectorAutor {

    @Override
    public void crearHistoria(Historia nuevaHistoria) {
        // Código para crear una historia
    }

    @Override
    public void buscarHistoria(String titulo) {
        // Código para buscar una historia
    }

    @Override
    public void editarHistoria(int id, String titulo, String contenido, String categoria) {
        // Código para editar una historia
    }

    public void registrarLectorAutor(int usuario_id, String nombre_completo, String correo_usuario, String contrasena_usuario) {
        LectorAutor nuevoLectorAutor = new LectorAutor(usuario_id, nombre_completo, correo_usuario, contrasena_usuario);
        registrarUsuario(nuevoLectorAutor);
    }
}
