package ParcialFinal.Cinco;

public class Samsung implements IMarca {
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private String cpu;
    private int precio;

    public Samsung(String modelo, int ram, int almacenamiento, String cpu, int precio) {
        this.marca = "Samsung";
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showData() {
        System.out.println("*****************************************************");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ram: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Cpu: " + cpu);
        System.out.println("Precio: " + precio);
        System.out.println("*****************************************************");
    }
}
