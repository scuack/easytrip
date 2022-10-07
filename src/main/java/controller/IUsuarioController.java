/*Diego*/
package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String username, String contrasena);
    
    public String register(String username, String contrasena,
            String nombre, String apellido, String email, double saldo);

    public String pedir(String username);
}