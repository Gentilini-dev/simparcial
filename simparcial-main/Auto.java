package models;

import Enums.CAJA;

import java.util.ArrayList;
import java.util.HashSet;

public final class Auto extends Vehiculo
{
    private ArrayList<String>prestaciones;
    private CAJA tipoCaja;
    
    
    public Auto(String modelo, String patente, String marca, double consumo, int cantidadRuedas,CAJA tipoCaja)
    {
        super(modelo, patente, marca, consumo, cantidadRuedas);
        this.tipoCaja=tipoCaja;
        this.prestaciones=new ArrayList<>();
    }
    
    public Auto(String patente)
    {
        super(patente);
    }
    
    @Override
    public double getPrecio()
    {
        return 15.0;
    }

    @Override
    public double CalcularPrecio() {
        return 15;
    }
}
