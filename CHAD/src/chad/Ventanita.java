package chad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import main.ClienteChat;

/**
 *
 * @author thiago
 */
public class Ventanita extends JFrame {

    public Ventanita() {
        //inicia la ventana
        iniciarComponentes();
        //inicia el contenido de la ventana
        iniciarventana();
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        JTextArea chat = new JTextArea();
        chat.setText(" ...");
        chat.setBounds(50, 50, 400, 250);
        chat.setEditable(false);
        ClienteChat s1 = new ClienteChat("192.168.61.11","2000",chat);
        s1.conectar();

        JTextField tetx = new JTextField();
        tetx.setText("");
        tetx.setBounds(100, 330, 250, 30);//x,y,ancho,alto

        JButton anna = new JButton();
        anna.setText("Salir");
        anna.setBounds(40, 10, 70, 30);
        anna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio hola = new Inicio();
                setVisible(false);
            }
        });
        
        JButton jose = new JButton();
        jose.setText("X");
        jose.setBounds(40, 310, 50, 50);
        jose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int optionPane = JOptionPane
                        .showConfirmDialog(rootPane,
                                "Esta seguro?",
                                "Cuidado",
                                JOptionPane.YES_NO_CANCEL_OPTION);
                chat.setText("");
                tetx.setText("");
            }
        });

        JCheckBox pepe = new JCheckBox();
        pepe.setBounds(96, 308, 200, 20);
        pepe.setText("Agregar al final");
        pepe.setSelected(true);

        JButton maria = new JButton();
        maria.setText("Enviar");
        maria.setBounds(360, 310, 100, 50);
        maria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = tetx.getText();
                s1.EnviarMensaje("thiago", txt);
                /*if (pepe.isSelected()) {
                    chat.append(txt);
                    chat.append(System.getProperty("line.separator"));
                } else {
                    String hc = chat.getText();
                    chat.setText("");
                    chat.append(txt);
                    chat.append(System.getProperty("line.separator"));
                    chat.append(hc);
                }*/
            }
        });

        this.add(jose);
        this.add(maria);
        this.add(tetx);
        this.add(chat);
        this.add(pepe);
        this.add(anna);
    }

    private void iniciarventana() {
        this.setTitle("Ventanita");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 420);//anhco, alto
        this.setLayout(null);
        this.setResizable(false);
    }
}
