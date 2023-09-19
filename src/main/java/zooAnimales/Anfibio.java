package zooAnimales;

import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class Anfibio extends Animal{

    public static ArrayList<Animal> listado = new ArrayList<>();

    public static int ranas;

    public static int  salamandras;

    private String colorPiel;

    private boolean venenoso;

    public static int veces = 1;

    public Anfibio() {veces++;}

    public Anfibio(String nombre, int edad,String habitat, String genero,String colorPiel,boolean venenoso) {
        super(nombre, edad,habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        veces++;

    }

    public Anfibio(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        veces++;
    }

    public  static int  cantidadAnfibios(){return veces;}

    public static Animal crearRana(String nombre, int edad, String genero){
        Anfibio e = new Anfibio(nombre,edad,"selva",genero,"rojo",false);
        Anfibio.listado.add(e);
        Anfibio.ranas = Anfibio.ranas + 1;
        return e;
    }

    public static Animal crearSalamandra(String nombre, int edad, String genero){
        Anfibio e = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
        Anfibio.listado.add(e);
        Anfibio.salamandras = Anfibio.salamandras + 1;
        return e;
    }

    @Override
    public String movimiento(){
        return "saltar";
    };

    public static ArrayList<Animal> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Animal> listado) {
        Anfibio.listado = listado;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
