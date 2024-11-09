package Models;

import java.util.ArrayList;

public class LectorAutor extends Usuario {
    
    ArrayList<Historia> array_historias = new ArrayList<>();

    public LectorAutor(int usuario_id, String nombre_completo, String correo_usuario, String contrasena_usuario) {
        super(usuario_id, nombre_completo, correo_usuario, contrasena_usuario);
    }

    public void crearHistoria(Historia nuevaHistoria) {
        array_historias.add(nuevaHistoria);
    }
    
}
