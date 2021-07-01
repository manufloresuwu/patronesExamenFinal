package ParcialFinal.Dos;

public class CuadratrackAdapter implements ICuadratrack {

    private CuadratrackElectrico CuadratrackElectrico;

    public CuadratrackAdapter(CuadratrackElectrico CuadratrackElectrico) {
        this.CuadratrackElectrico = CuadratrackElectrico;
        System.out.println("Adaptando el cuadratrack");
    }

    @Override
    public void llenarGasolina() {
        System.out.println("Adaptando carga");
        this.CuadratrackElectrico.cargar();
    }

    @Override
    public void verEstadoCombustible() {
        this.CuadratrackElectrico.setLimit(50);
        System.out.println("Adaptando revision");
        this.CuadratrackElectrico.estadoDeElectricidad();
        this.CuadratrackElectrico.setLimit(10);
    }
}
