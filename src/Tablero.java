public class Tablero {
    
    //atributos del tablero
    private int casillas = 0;
    private int jugadores = 0;
    private Ficha[] fichas = {new Ficha("verde"), new Ficha("rojo"), new Ficha("azul"), new Ficha("amarillo"), new Ficha("negro")};
    private int jugadorMoviendo = 0;

    public Tablero(int casillas, int jugadores, int jugadorMoviendo) {

        this.casillas = casillas;
        this.jugadores = jugadores;
        this.jugadorMoviendo = jugadorMoviendo;
    }

    public void moverJugador() {
        
        if (jugadorMoviendo <= 4)
            fichas[jugadorMoviendo].avanzar();    
    }

    public void siguienteJugador() {

        jugadorMoviendo++;

        if(jugadorMoviendo == 5)
            jugadorMoviendo = 0;
    }

    public int getPlayerPosition() {
        return this.fichas[this.jugadorMoviendo].getPosition();
    }

    public Ficha getPlayer() {
        return fichas[jugadorMoviendo];
    }

}
