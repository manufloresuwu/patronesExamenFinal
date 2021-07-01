package ParcialFinal.Tres;

public class Universidad implements ISistema {

    public Universidad(IRedSocial redSocial) {
        super();
        this.red = redSocial;
    }

    public Universidad(String nombre, String[] estudiantes, String requisitos, int capacidad) {
        super();
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
        this.capacidad = capacidad;
    }

    String nombre, estudiantes[], requisitos;
    int capacidad;
    IRedSocial red;

    public IRedSocial getRed() {
        return red;
    }

    public void setRed(IRedSocial red) {
        this.red = red;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void showData() {
        System.out.println("*****************************************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estudiantes: ");
        for (int i = 0; i <= estudiantes.length - 1; i++)
            System.out.println("	" + estudiantes[i]);
        System.out.println("Requisitos: " + requisitos);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("*****************************************************");
    }

    @Override
    public void integrar() {
        System.out.println("Integrando...");
        red.showData();
    }

}