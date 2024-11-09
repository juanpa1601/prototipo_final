package Controller;
import javax.swing.JOptionPane;

import Models.Administrador;
import Models.Usuario;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static void main(String[] args) {
        //Usuario predeterminado
        Administrador administrador_predeterminado = new Administrador(1, "Juan Pablo Rodriguez", "juan@gmail.com", "root");
        usuarios.add(administrador_predeterminado);
        
        //Menú principal
        boolean salir_principal = false;
        String menu_principal = "\n--- Menú principal ---\n" +
                                "1. Iniciar sesión\n" +
                                "2. Registrarse\n" +
                                "3. Salir\n" +
                                "Seleccione una opción: ";
        
        while (!salir_principal) {
            String opcion_principal_string = JOptionPane.showInputDialog(menu_principal);            
            
            if (opcion_principal_string == null) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                salir_principal = true;
                continue;
            }
            
            int opcion_principal;
            
            try {
                opcion_principal = Integer.parseInt(opcion_principal_string);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
                continue;
            }

            switch (opcion_principal) {
                case 1:
                    //Iniciar sesión
                    if(usuarios.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                    }

                    break;
                case 2:
                    //Registrarse
                    break;
                case 3:
                    salir_principal = true;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }
}
