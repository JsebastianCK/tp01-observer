package panel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import general.Chat;
import util.Observer;

public class ChatPanel extends JPanel implements Observer {
    private Chat chat;

    public ChatPanel(Chat chat){
        this.chat = chat;
        this.chat.attach(this);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void update(){
        String mensaje = chat.getLastMensaje().getFormattedMessage();
        JLabel label = new JLabel(mensaje, 2);

        this.add(label);
        this.revalidate();
    }
}
