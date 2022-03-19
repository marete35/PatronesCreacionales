package ar.com.marete.factorymethodpattern;

public class Escaleno extends Triangulo{


    public Escaleno(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo escaleno";
    }

    @Override
    public double getSuperficie() {
        //Algoritmo para calcular la superficie.
        return 0;
    }

    @Override
    public void dibujate() {
        //Algoritmo para dibujarse
    }
}
