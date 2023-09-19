package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends  Animal{
    private static ArrayList<Animal> listado = new ArrayList<>();

    public static int  iguanas;

    public static  int serpientes;

    private String  colorEscamas;

    private int largoCola;

    public static int veces = 1;

    public Reptil(){veces++;}

    public Reptil(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        veces++;
    }

    public Reptil(String nombre, int edad,String habitat, String genero,String colorEscamas,int largoCola) {
        super(nombre, edad,habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        veces++;

    }

    public  static int  cantidadReptiles(){return veces;}

    public static Animal crearIguana(String nombre, int edad, String genero){
        Reptil e = new Reptil(nombre,edad,"humedal",genero,"verde",3);
        Reptil.listado.add(e);
        Reptil.iguanas = Reptil.iguanas + 1;
        return e;
    }

    public static Animal crearSerpiente(String nombre, int edad, String genero){
        Reptil e = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
        Reptil.listado.add(e);
        Reptil.serpientes = Reptil.serpientes + 1;
        return e;
    }

    @Override
    public String movimiento(){
        return "reptar";
    };

    public static ArrayList<Animal> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Animal> listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}
