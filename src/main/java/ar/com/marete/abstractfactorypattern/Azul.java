package ar.com.marete.abstractfactorypattern;

public class Azul extends Color{

    public void colorea(TV tv){
        System.out.println("Pintando de azul el "+ tv.getDescripcion());
    }
}
