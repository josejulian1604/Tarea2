import java.util.Random;

public class Dado {

    private int caras = 0;
    private Random random = new Random();

    public Dado(int numCaras) {

        this.caras = numCaras;

    }
    
    public int lanzar() {
        return this.random.nextInt(this.caras + 1);
    }

}
