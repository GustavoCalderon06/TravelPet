package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana {
    private JLabel bienvenida;
    private JButton botonRegistro, botonLogin, botonSalida;

    public VentanaPrincipal() {
        super("VentanaPrincipal", 500, 300);
        generarElementosVentana();
    }

    public void generarElementosVentana() {
        generarBotonRegistro();
        generarBotonLogin();
        generarBotonSalida();
        generarImagen();

    }


    private void generarImagen() {
        JLabel labelUser = new JLabel(new ImageIcon("src\\main\\resources\\Logo.png"));
        labelUser.setBounds(40, 40, 200, 200);
        labelUser.setForeground(Color.BLACK);
        super.add(labelUser);
    }

    public void generarBotonRegistro() {
        String textoBoton = "Registrarse";
        this.botonRegistro = super.generarBoton(textoBoton, 280, 40, 200, 50);
        this.add(this.botonRegistro);
        this.botonRegistro.addActionListener(this);
    }

    public void generarBotonLogin() {
        String textoBoton = "Iniciar Sesión";
        this.botonLogin = super.generarBoton(textoBoton, 280, 115, 200, 50);
        this.add(this.botonLogin);
        this.botonLogin.addActionListener(this);
    }

    public void generarBotonSalida() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 280, 190, 200, 50);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistro) {
            VentanaRegistro registro = new VentanaRegistro();
            this.dispose();
        }
        if (e.getSource() == this.botonLogin) {
            VentanaLogin login = new VentanaLogin();
            this.dispose();
        }
        if (e.getSource() == this.botonSalida) {
            this.dispose();
            System.exit(0);
        }
    }
}