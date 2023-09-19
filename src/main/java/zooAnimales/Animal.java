package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {

    public  static int totalAnimales = 0;

    private String nombre;

    private int edad;

    private String  habitat;

    private String genero;

    private ArrayList<Zona> zona;

    public  Animal(){

    }

    public Animal(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }


    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }


    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public static String  totalPorTipo(){
        String  comp = "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n" +
                "Aves: "+Ave.cantidadAves()+"\n" +
                "Reptiles: "+Reptil.cantidadReptiles()+"\n" +
                "Peces: "+Pez.cantidadPeces()+"\n" +
                "Anfibios: "+Anfibio.cantidadAnfibios();
        return comp;
    };

    @Override
    public String toString() {
        return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
    }

    public String movimiento(){
        return "desplazarse";
    };


    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    }
}
