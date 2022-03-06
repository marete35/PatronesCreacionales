package ar.com.marete.abstractfactorypattern;

public class App {

    public static void main(String[] args) {
        //probando el factory LCD + Azul
        AbstractFactory f1 = new FactoryLcdAzul();
        EnsamblajeTV e = new EnsamblajeTV(f1);

        //probando el factory Plasma + Amarillo
        AbstractFactory f2 = new FactoryPlasmaAmarillo();
        EnsamblajeTV e1 = new EnsamblajeTV(f2);
    }
}
