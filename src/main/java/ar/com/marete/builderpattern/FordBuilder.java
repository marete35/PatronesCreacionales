package ar.com.marete.builderpattern;

public class FordBuilder extends AutoBuilder{

    public void buildMarca(){
        System.out.println("Se construye la marca Ford");
        auto.setMarca("Ford");
    }

    public void buildModelo(){
        System.out.println("Se construye el modelo Ford");
        auto.setModelo("Focus");
    }

    public void buildMotor(){
        System.out.println("Se construye el motor Ford");
        Motor motor = new Motor();
        auto.setMotor(motor);
    }

    public void buildPuertas(){
        System.out.println("Se construye las puertas Ford");
        auto.setCantidadDePuertas(4);
    }
}
