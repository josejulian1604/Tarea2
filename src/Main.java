public class Main {
    public static void main(String[] args) throws Exception {
        
        int casillas = 15;
        int jugadores = 5;
        int jugadorMoviendo = 0;
        Tablero tablero = new Tablero(casillas, jugadores, jugadorMoviendo);

        while(tablero.getPlayerPosition() <= casillas) {

            System.out.println("\nTira el jugador de color " + tablero.getPlayer().getColor());

            tablero.moverJugador();

            if(tablero.getPlayer().getPosition() >= casillas)
                break;

            tablero.siguienteJugador();

        }
        System.out.println("Gano el jugador de color: " + tablero.getPlayer().getColor());
    }
}
