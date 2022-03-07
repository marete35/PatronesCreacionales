package ar.com.marete.builderpattern;

public class AutoDirector {

    //No es necesario que exista la palabra Director.
    //Esta clase podria llamarse concesionaria, Garage, FabricaDeAutos. //etc

    private AutoBuilder autoBuilder;

    public void constructAuto(){
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder ab){
        autoBuilder = ab;
    }

    public Auto getAuto(){
        return autoBuilder.getAuto();
    }
}
