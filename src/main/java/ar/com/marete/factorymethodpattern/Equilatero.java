package ar.com.marete.factorymethodpattern;

public class Equilatero extends Triangulo{

    public Equilatero(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo Equilatero";
    }

    @Override
    public double getSuperficie() {
        //Algoritmo para retornar superfice.
        return 0;
    }

    @Override
    public void dibujate() {
        //Algoritmo para dibujar
    }
}
