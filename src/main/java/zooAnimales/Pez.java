package zooAnimales;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pez extends Animal{

    public static ArrayList<Animal> listado = new ArrayList<>();

    public  static int salmones=0;

    public  static int bacalaos=0;

    public  String colorEscamas;

    public int cantidadAletas;

    public static int veces = 1;

    public Pez(){veces++;}

    public Pez(String nombre, int edad, String  genero){
        super(nombre,edad,genero);
        veces++;
    }

    public Pez(String nombre, int edad,  String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        veces++;
    }

    public static int cantidadPeces(){return veces;}

    @Override
    public String movimiento(){
        return "nadar";
    };

    public static Animal crearSalmon(String nombre, int edad, String genero){
        Pez e = new Pez(nombre,edad,"oceano",genero,"rojo",6);
        Pez.listado.add(e);
        Pez.salmones = Pez.salmones + 1;
        return e;
    }

    public static Animal crearBacalao(String nombre, int edad, String genero){
        Pez e = new Pez(nombre,edad,"oceano",genero,"gris",6);
        Pez.listado.add(e);
        Pez.bacalaos = Pez.bacalaos + 1;
        return e;
    }


    public static ArrayList<Animal> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Animal> listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
