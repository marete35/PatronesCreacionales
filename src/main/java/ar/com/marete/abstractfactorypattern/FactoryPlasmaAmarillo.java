package ar.com.marete.abstractfactorypattern;

public class FactoryPlasmaAmarillo extends AbstractFactory{



    public Color createColor(){
        return new Amarillo();
    }

    public TV createTV(){
        Plasma plasma =  new Plasma();
        plasma.setDescripcion("Plasma");
        return plasma;
    }
}
