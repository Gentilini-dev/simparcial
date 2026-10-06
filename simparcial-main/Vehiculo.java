package models;

import java.util.Objects;

public abstract class Vehiculo implements IcalcularPrecio
{
    private String modelo;
    private String patente;
    private String marca;
    private double consumo;
    private int cantidadRuedas;
    private double precio;
    
    public Vehiculo(String modelo, String patente, String marca, double consumo, int cantidadRuedas)
    {
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
        this.consumo = consumo;
        this.cantidadRuedas = cantidadRuedas;
        
    }
    
    public Vehiculo(String patente)
    {
        this.patente = patente;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public double getConsumo()
    {
        return consumo;
    }
    
    public void setConsumo(double consumo)
    {
        this.consumo = consumo;
    }
    
    public String getPatente()
    {
        return patente;
    }
    
 
    public abstract double getPrecio();

    
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public int getCantidadRuedas()
    {
        return cantidadRuedas;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Vehiculo vehiculo))
        {
            return false;
        }
        return Objects.equals(patente, vehiculo.patente);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hashCode(patente);
    }
    
    @Override
    public String toString()
    {
        return
                "modelo:" + modelo + '\'' +
                "patente:" + patente + '\'' +
                "marca:" + marca + '\'' +
                "consumo:" + consumo + '\'' +
                "cantidadRuedas:" + cantidadRuedas + '\'' +
                "precio:" + precio ;
    }
}
