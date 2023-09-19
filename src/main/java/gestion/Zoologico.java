package gestion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;

    private ArrayList<Zona> zonas = new ArrayList<>();
    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }

    public Zoologico(){}

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    public  int cantidadTotalAnimales(){
        int acum = 0;
        for (Zona z: this.zonas) {
            acum = acum + z.cantidadAnimales();
        }
        return acum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}
