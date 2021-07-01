package ParcialFinal.Uno;

public class Cliente {

    public static void main(String[] args) {

        LaPaz laPaz = new LaPaz(19,5600,"Frio",1000);
        Cochabamba cochabamba = new Cochabamba(13, 4000, "Templado", 2000);
        SantaCruz santaCruz = new SantaCruz(34, 10300, "Calido", 7000);

        Turista turis = new Turista("Juliana",5000,84806987);

        santaCruz.serVisitado(turis);
        laPaz.serVisitado(turis);
        cochabamba.serVisitado(turis);

    }

}