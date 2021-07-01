package ParcialFinal.Cinco;

public class Vidrio extends Decorator {
    private int precio;

    public Vidrio(IMarca marca, int precio) {
        super(marca);
        this.precio = precio;
    }

    public void showData() {
        super.addVidrio(precio);
    }
}
