public class Ficha {

    private String color = "";
    private int posicion = 0;
    private Dado dado = new Dado(6);

    public Ficha(String color) {

        this.color = color;
        this.posicion = 0;
    }

    public void avanzar() {
        
        int pasos = this.dado.lanzar();
        this.posicion += pasos;
        System.out.println("El jugador esta en la posicion: " + this.posicion);
    }

    public String getColor() {
        return this.color;
    }

    public int getPosition() {
        return this.posicion;
    }
}
