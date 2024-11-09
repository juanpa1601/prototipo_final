package Models.Interfaces;

public interface InterfaceAdministrador extends InterfaceUsuario{
    void revisarHistoria(int id); //Esta se puede omitir 
    void eliminarHistoria(int id, String razon);
    void aprobarHistoria(int id); //Esta se puede omitir
    void verUsuarios();
}
