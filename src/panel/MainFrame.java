package panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import general.Chat;
import general.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MainFrame extends JFrame {
    private Chat chat;
    private Usuario usuario;

    public MainFrame(Chat chat, Usuario usuario) {
        this.chat = chat;
        this.usuario = usuario;
        this.initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
    }

    /**
     * Inicializa todos los componentes
     * que se van a renderizar dentro de
     * la ventana
     */
    private void initComponents() {
        this.setLayout(new BorderLayout());
        ChatPanel chatPanel = new ChatPanel(this.chat);
        NewMessagePanel nuevoMensaje = new NewMessagePanel(this.chat, this.usuario);

        chatPanel.setBackground(new Color(16377799));
        nuevoMensaje.setPreferredSize(new Dimension(0, 50));

        this.add(chatPanel, BorderLayout.CENTER);
        this.add(nuevoMensaje, BorderLayout.SOUTH);
    }
}
