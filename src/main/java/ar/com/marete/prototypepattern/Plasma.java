package ar.com.marete.prototypepattern;

public class Plasma extends TV{

    private double aungoloVision;
    private double tiempoRespuesta;

    public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision, double tiempoRespuesta) {
        super(marca, pulgadas, color, precio);
        setAungoloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
    }

    public double getAungoloVision() {
        return aungoloVision;
    }

    public void setAungoloVision(double aungoloVision) {
        this.aungoloVision = aungoloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
