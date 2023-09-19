package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{

    private static ArrayList<Mamifero> listado;

    public static int caballos=0;

    public static int leones=0;

    private boolean pelaje;

    private int patas;

    public Mamifero(){

    }
    public Mamifero(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public Mamifero(String nombre, int edad, String habitat, String genero,  boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public Mamifero(String nombre, int edad,String genero) {
        super(nombre, edad, genero);
    }

    public static int cantidadMamiferos(){
        return Mamifero.listado.size();
    }

    public static Animal crearCaballo(String nombre, int edad, String genero){
        Mamifero e = new Mamifero(nombre,edad,"pradera",genero,true,4);
        Mamifero.listado.add(e);
        Mamifero.caballos = Mamifero.caballos + 1;
        return e;
    }

    public static Animal crearLeon(String nombre, int edad, String genero){
        Mamifero e = new Mamifero(nombre,edad,"selva",genero,true,4);
        Mamifero.listado.add(e);
        Mamifero.leones = Mamifero.leones +  1;
        return e;
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
