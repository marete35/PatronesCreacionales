package ar.com.marete.abstractfactorypattern;

public class Amarillo extends Color{

    public void colorea(TV tv){
        System.out.println("Pintando de amarillo el "+ tv.getDescripcion());
    }
}
