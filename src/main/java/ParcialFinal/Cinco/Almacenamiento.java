package ParcialFinal.Cinco;

public class Almacenamiento extends Decorator {

    private int tamanio;

    public Almacenamiento(IMarca marca, int tamanio) {
        super(marca);
        this.tamanio = tamanio;
    }

    public void showData() {
        super.addAlmacenamiento(tamanio);
    }

}
