package ar.com.marete.builderpattern;

/**
 * Utilizaremos la clase AutoBuilder para que sirve para base de construccion de los distintos tipos de autos.
 */
public abstract class AutoBuilder {

    protected Auto auto = new Auto();

    public Auto getAuto(){
        return auto;
    }

    public void crearAuto(){
        auto = new Auto();
    }

    public abstract void buildMotor();
    public abstract void buildModelo();
    public abstract void buildMarca();
    public abstract void buildPuertas();

}
