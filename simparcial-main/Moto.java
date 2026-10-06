package models;

public final class Moto extends Vehiculo
{
    private int cilindrada;
    private boolean tieneBaul;
    
    public  Moto(String modelo, String patente, String marca, double consumo, int cantidadRuedas, int cilindrada, boolean tieneBaul)
    {
        super(modelo, patente, marca, consumo, cantidadRuedas);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }
    
    public Moto(String patente, int cilindrada, boolean tieneBaul)
    {
        super(patente);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }
    
    @Override
    public double getPrecio()
    {
        return 7.0;
    }

    @Override
    public double CalcularPrecio() {
        return 7.0;
    }
}
