package ar.com.marete.abstractfactorypattern;

/**
 * Representa Factory Concreto.
 */
public class FactoryLcdAzul extends AbstractFactory{


    @Override
    public TV createTV() {
        LCD lcd =  new LCD();
        lcd.setDescripcion("LCD");
        return lcd;
    }

    public Color createColor(){
        return new Azul();
    }
}
