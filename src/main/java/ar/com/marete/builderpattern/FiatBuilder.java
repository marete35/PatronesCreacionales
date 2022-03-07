package ar.com.marete.builderpattern;

/**
 * Realizaremos dos builders concretos que son: FordBuilder y FiatBuilder. Cada Builder tiene el conocimiento necesario
 * para saber como se construye su auto.
 */
public class FiatBuilder extends AutoBuilder{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Palio");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(2);
    }
}
