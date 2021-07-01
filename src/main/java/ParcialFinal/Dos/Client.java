package ParcialFinal.Dos;

public class Client {
    public static void main(String[]args){
        CuadratrackElectrico CuadratrackElectrico =new CuadratrackElectrico();

        Diesel cuadra1= new Diesel();
        GasolinaEspecial cuadra2 = new GasolinaEspecial();
        Gasolina cuadra3 = new Gasolina();
        CuadratrackAdapter adapter = new CuadratrackAdapter(CuadratrackElectrico);

        cuadra1.llenarGasolina();
        cuadra1.verEstadoCombustible();

        cuadra2.llenarGasolina();
        cuadra2.verEstadoCombustible();

        cuadra3.llenarGasolina();
        cuadra3.verEstadoCombustible();

        adapter.llenarGasolina();
        adapter.verEstadoCombustible();

    }
}
