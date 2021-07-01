package ParcialFinal.Cuatro;

import java.util.*;

public class Servidor1 implements ICluster {
    private String ip;
    private String host;
    private List<Usuario> lista;

    public Servidor1() {
    }

    public Servidor1(String ip, String host) {
        this.ip = ip;
        this.host = host;
        this.lista = new ArrayList<>();
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
        return lista;
    }

    public void setUser_list2(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public void guardar(Usuario user) {
        System.out.println("Usuario guardado correctamente");
        lista.add(user);
        user.showData();
    }
}