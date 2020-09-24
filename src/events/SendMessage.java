package events;

import java.awt.event.ActionListener;

import javax.swing.JTextField;

import general.Chat;
import general.Mensaje;
import general.Usuario;

import java.awt.event.ActionEvent;

public class SendMessage implements ActionListener {
    private JTextField message;
    private Chat chat;
    private Usuario usuario;

    public SendMessage(JTextField message, Chat chat, Usuario usuario) {
        this.message = message;
        this.chat = chat;
        this.usuario = usuario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Mensaje mensaje = new Mensaje(this.usuario, this.message.getText());
        if(!mensaje.empty()) {
            this.chat.addMensaje(mensaje);
            this.message.setText(null);
        }
    }
}
