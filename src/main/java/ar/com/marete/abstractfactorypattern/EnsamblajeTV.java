package ar.com.marete.abstractfactorypattern;

public class EnsamblajeTV {

    public EnsamblajeTV(AbstractFactory factory){
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
}
