package chad;

import javax.swing.*;

public class CHAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario n1 = new Usuario("thiago", "contraseña");
        Inicio hola = new Inicio();
        System.out.println(n1.getUser());
        
    }
}
