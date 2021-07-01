package ParcialFinal.Dos;

public class CuadratrackElectrico implements ICuadratrackAdapter {

    private int limit=10;
    private int carga;
    private int estadobateria;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void cargar() {
        carga=0+(int) (Math.random() * ((20 - 0)+1));
        System.out.println("*****************************************************");
        System.out.println("Modelo: "+this.getClass().getSimpleName());
        System.out.println("Bateria en "+carga + "%");
        System.out.println("*****************************************************");
    }

    @Override
    public void estadoDeElectricidad() {
        estadobateria=1+(int) (Math.random() * ((limit- 1)+1));
        System.out.println("*****************************************************");
        System.out.println("Modelo: "+this.getClass().getSimpleName());
        System.out.println("Estado de bateria: " + estadobateria + "%");
        System.out.println("*****************************************************");
    }
}