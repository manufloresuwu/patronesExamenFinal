package ParcialFinal.Dos;

public class Diesel implements ICuadratrack {
    private int limit=50;
    private int num;
    private int estadocombustible;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void llenarGasolina() {
        num= 0+(int) (Math.random() * ((100 - 0)+1));
        System.out.println("*****************************************************");
        System.out.println("Modelo: "+this.getClass().getSimpleName());
        System.out.println("Llenando la gasolina en "+num);
        System.out.println("*****************************************************");
    }

    @Override
    public void verEstadoCombustible() {
        estadocombustible=1+(int) (Math.random() * ((limit- 1)+1));
        System.out.println("*****************************************************");
        System.out.println("Modelo: "+this.getClass().getSimpleName());
        System.out.println("Estado de combustible: " + estadocombustible + "%");
        System.out.println("*****************************************************");
    }
}
