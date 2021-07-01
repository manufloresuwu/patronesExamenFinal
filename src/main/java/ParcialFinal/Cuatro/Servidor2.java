package ParcialFinal.Cuatro;

import java.util.*;

public class Servidor2 implements ICluster {
    private String ip;
    private String host;
    private List<Usuario> lista2;

    public Servidor2() {
    }

    public Servidor2(String ip, String host) {
        this.ip = ip;
        this.host = host;
        this.lista2 = new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost_name() {
        return host;
    }

    public void setHost_name(String host) {
        this.host = host;
    }

    public List<Usuario> getUser_list2() {
        return lista2;
    }

    public void setUser_list2(List<Usuario> lista2) {
        this.lista2 = lista2;
    }

    @Override
    public void guardar(Usuario user) {
        System.out.println("Usuario guardado correctamente");
        lista2.add(user);
        user.showData();
    }
}