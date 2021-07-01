package ParcialFinal.Cuatro;

public class Proxy implements ICluster{
    private int id;
    private Servidor1 server1 = new Servidor1("192.168.16.11","SERV-1");
    private Servidor1 server2 = new Servidor1("192.168.16.12","SERV-1");

    public Proxy() {
    }

    public Proxy(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void guardar(Usuario user) {
        id = user.getUser_id();
        if(user.isIs_correct()){
            if(isPrime(id)){
                System.out.println("Guardando en servidor 1....");
                server1.guardar(user);
            }else{
                System.out.println("Guardando en servidor 2....");
                server2.guardar(user);
            }
        }else{
            user.showData();
        }
    }

    public boolean isPrime(Integer num){
        if(num%2 == 0){
            return false;
        }else if(num < 2){
            return false;
        } else{
            for(int i = 3; i * i < num ; i++){
                i++;
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}