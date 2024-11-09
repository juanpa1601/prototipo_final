package Models.Interfaces;

import Models.Historia;

public interface InterfaceLectorAutor extends InterfaceUsuario{
    void crearHistoria(Historia nuevaHistoria);
    void buscarHistoria(String titulo);
    void editarHistoria(int id, String titulo, String contenido, String categoria);
} 
