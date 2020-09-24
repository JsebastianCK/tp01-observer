package general;

import java.util.ArrayList;
import java.util.List;

import util.Observable;

public class Chat extends Observable {
    private List<Mensaje> mensajes;

    public Chat() {
        this.mensajes = new ArrayList<Mensaje>();
    }

    public List<Mensaje> getMensajes() {
        return this.mensajes;
    }

    public void addMensaje(Mensaje mensaje) {
        this.mensajes.add(mensaje);
        this.notifyObservers();
    }

    public Mensaje getLastMensaje(){
        return mensajes.get(mensajes.size()-1);
    }

}