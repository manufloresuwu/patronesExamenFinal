package ParcialFinal.Cuatro;

public class Cliente {
    public static void main (String[] args){
        Proxy proxy =  new Proxy();

        proxy.guardar(new Usuario(2345, "Carminia Borda","12345",true));
        proxy.guardar(new Usuario(51150,"Luis Flores","6789", false));
        proxy.guardar(new Usuario(51150,"Luis Flores","6789", true));

    }
    //
}
