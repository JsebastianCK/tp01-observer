package general;

import java.time.LocalDateTime;

public class Mensaje {
    private Usuario usuario;
    private String mensaje;
    private LocalDateTime hora;

    public Mensaje(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.hora = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public LocalDateTime getHora() {
        return this.hora;
    }

    public String getFormattedMessage() {
        String usuario = this.usuario.getNombre();
        String hora = String.format("%s:%s:%s", this.hora.getHour(), this.hora.getMinute(), this.hora.getSecond());
        String mensaje = this.mensaje;

        return String.format("(%s) %s: %s", hora, usuario, mensaje);
    }

    public boolean empty() {
        return this.mensaje.length() <= 0;
    }
}
