package ParcialFinal.Tres;
public class Cliente {

    public static void main(String[] args) {

        String estudiantes[] = { "Mateo", "Alan", "Cristian", "Manuela" };

        Escuela escuela = new Escuela(new Facebook());
        Colegio colegio = new Colegio(new Whatsapp());
        Universidad universidad = new Universidad(new Twitter());

        escuela.setEstudiantes(estudiantes);
        escuela.setCapacidad(300);
        escuela.setNombre("Los Pinos");
        escuela.setRequisitos("N/A");

        colegio.setEstudiantes(estudiantes);
        colegio.setCapacidad(400);
        colegio.setNombre("Loretto");
        colegio.setRequisitos("N/A");

        universidad.setEstudiantes(estudiantes);
        universidad.setCapacidad(500);
        universidad.setNombre("UPB");
        universidad.setRequisitos("Ganas de Aprender");

        escuela.showData();
        escuela.integrar();

        colegio.showData();
        colegio.integrar();

        universidad.showData();
        universidad.integrar();

    }

}
