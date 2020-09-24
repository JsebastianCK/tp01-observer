package panel;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import events.SendMessage;
import general.Chat;
import general.Usuario;

import java.awt.BorderLayout;

public class NewMessagePanel extends JPanel {
    private Chat chat;
    private Usuario usuario;

    public NewMessagePanel(Chat chat, Usuario usuario) {
        this.chat = chat;
        this.usuario = usuario;
        this.initComponents();
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        JTextField mensaje = new JTextField();
        JButton enviar = new JButton();
        enviar.setText("Enviar");

        mensaje.addActionListener(new SendMessage(mensaje, this.chat, this.usuario));
        enviar.addActionListener(new SendMessage(mensaje, this.chat, this.usuario));

        this.add(mensaje, BorderLayout.CENTER);
        this.add(enviar, BorderLayout.EAST);
    }
}
