package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    public static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;
    public static int veces = 1;

    public Ave(){veces++;}

    public Ave(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        veces++;
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        veces++;
    }

    public Ave(String nombre, int edad,String genero) {
        super(nombre, edad, genero);
        veces++;
    }

    public static int cantidadAves(){
        return 4;
    }

    public static Animal crearHalcon(String nombre, int edad,String genero){
        Ave e = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
        Ave.listado.add(e);
        Ave.halcones = Ave.halcones + 1;
        return e;
    }

    public static Animal crearAguila(String nombre, int edad,String genero){
        Ave e = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
        Ave.listado.add(e);
        Ave.aguilas = Ave.aguilas + 1;
        return e;
    }

    @Override
    public  String movimiento(){
        return "volar";
    }


    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
