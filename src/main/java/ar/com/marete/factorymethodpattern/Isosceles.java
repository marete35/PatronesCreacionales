package ar.com.marete.factorymethodpattern;

public class Isosceles extends Triangulo{


    public Isosceles(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return null;
    }

    @Override
    public double getSuperficie() {
        return 0;
    }

    @Override
    public void dibujate() {

    }
}
