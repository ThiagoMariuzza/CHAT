package chad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author thiago
 */
public class Inicio extends JFrame {
    private boolean recordar;
    private Usuario user;
    
    
    public Inicio() {
        //inicia la ventana
        iniciarComponentes();
        //inicia el contenido de la ventana
        iniciarventana();
        this.setVisible(true);
    }

    
    private void iniciarComponentes() {
        Usuario n1 = new Usuario("thiago", "contraseña");
        
        JLabel titulo = new JLabel();
        titulo.setText("WARAP");
        titulo.setBounds(170, 50, 100, 30);

        JLabel usu = new JLabel();
        usu.setText("Usuario: ");
        usu.setBounds(30, 130, 100, 30);

        JTextField usuario = new JTextField();
        usuario.setText("");
        usuario.setBounds(100, 130, 250, 30);//x,y,ancho,alto

        JCheckBox recor = new JCheckBox();
        recor.setBounds(30, 230, 200, 20);
        recor.setText("Recuerdame");
        recor.setSelected(false);

        JLabel con = new JLabel();
        con.setText("Contrasena: ");
        con.setBounds(30, 190, 100, 30);

        JPasswordField pasword = new JPasswordField();
        pasword.setText("");
        pasword.setBounds(120, 190, 230, 30);//x,y,ancho,alto

        if (recordar) {
            usuario.setText(n1.getUser());
            pasword.setText(n1.getUser());
        }
        System.out.println(n1.getUser());
        JButton enzo = new JButton();
        enzo.setText("Ingresar");
        enzo.setBounds(160, 250, 100, 50);
        enzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuario.getText().equals(n1.getUser()) && pasword.getText().equals(n1.getPass())) {
                    recordar = recor.isSelected();
                    Ventanita hola = new Ventanita();
                    setVisible(false);
                } else {
                    System.out.println("login failed");
                }
            }
        });

        this.add(enzo);
        this.add(usuario);
        this.add(pasword);
        this.add(usu);
        this.add(con);
        this.add(titulo);
        this.add(recor);
    }

    private void iniciarventana() {
        this.setTitle("Ventanita");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 350);//anhco, alto
        this.setLayout(null);
        this.setResizable(false);

    }
}
