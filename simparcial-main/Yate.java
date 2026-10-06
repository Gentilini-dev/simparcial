package models;

import java.util.Objects;

public final class Yate implements IcalcularPrecio
{
    private double metrosDeslora;
    private TIPOSDEUSO uso;
    private String NombreIdentificador;
    private double precio;

    public Yate(TIPOSDEUSO uso, double metrosDeslora, String nombreIdentificador) {
        this.uso = uso;
        this.metrosDeslora = metrosDeslora;
        NombreIdentificador = nombreIdentificador;
        precio=100.0;
    }

    public double getMetrosDeslora() {
        return metrosDeslora;
    }

    public void setMetrosDeslora(double metrosDeslora) {
        this.metrosDeslora = metrosDeslora;
    }

    public TIPOSDEUSO getUso() {
        return uso;
    }

    public void setUso(TIPOSDEUSO uso) {
        this.uso = uso;
    }

    public String getNombreIdentificador() {
        return NombreIdentificador;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "metrosDeslora=" + metrosDeslora +
                ", uso=" + uso +
                ", NombreIdentificador='" + NombreIdentificador + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Yate yate)) return false;
        return Objects.equals(NombreIdentificador, yate.NombreIdentificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(NombreIdentificador);
    }

    @Override
    public double CalcularPrecio() {
        return 100.0;
    }
}
