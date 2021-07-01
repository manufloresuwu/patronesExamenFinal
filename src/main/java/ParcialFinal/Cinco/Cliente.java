package ParcialFinal.Cinco;

public class Cliente {
    public static void main(String[] args) {

        IMarca apple = new Apple("Xs",2,256,"A12", 7000);
        apple = new Carcasa(apple,100);
        apple = new Vidrio(apple, 100);
        apple.showData();

        IMarca samsung = new Samsung("S20",16,128,"Snapdragon 4500",8000);
        samsung = new Almacenamiento(samsung,128);
        samsung.showData();

        IMarca xiaomi = new Xiaomi("Note 8",8,64,"Kirby 3200",3000);
        xiaomi = new Vidrio(xiaomi, 150);
        xiaomi = new Almacenamiento(xiaomi, 64);
        xiaomi.showData();

    }
}
