package general;

import panel.MainFrame;

public class App {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Usuario jorge = new Usuario("Jorge");
        Usuario raul = new Usuario("Raul");
        MainFrame mainFrameUno = new MainFrame(chat, jorge);
        MainFrame mainFrameDos = new MainFrame(chat, raul);

        mainFrameUno.setVisible(true);
        mainFrameDos.setVisible(true);
    }
}
