package models;

import java.util.ArrayList;
import java.util.HashSet;

public class ClaseGestora
{
    private ArrayList<Vehiculo> listaVehiculos;
    private HashSet<Yate> listayates;
    public ClaseGestora()
    {
        listaVehiculos=new ArrayList<>();
        listayates=new HashSet<>();
    }
    
  public boolean agregarVehiculo(Vehiculo vehiculo)
  {
    if(vehiculo==null|| listaVehiculos.contains(vehiculo))
    {
        return false;
    }
    return listaVehiculos.add(vehiculo);
  }
  public boolean buscarPorpatene(String patente)
  {
      if(patente==null)
      {
          return false;
      }
      for(Vehiculo v: listaVehiculos)
      {
          if(patente.equals(v.getPatente()))
          {
              return true;
          }
      }
      return false;
  }
  public int contarV()
  {
      if(listaVehiculos==null)
      {
          return 0;
      }
      HashSet<Vehiculo>unicos=new HashSet<>(listaVehiculos);
      
      return unicos.size();
  }
  public String listarVehiculos()
  {
      StringBuilder sb=new StringBuilder();
      for (Vehiculo v: listaVehiculos)
      {
          sb.append(v).append("\n");
      }
      return sb.toString();
  }
  public boolean eliminarPorpatente(String patente)
  {
      if(patente==null)
      {
          return false;
      }
      for(Vehiculo v: listaVehiculos)
      {
          if(patente.equals(v.getPatente()))
          {
              listaVehiculos.remove(v);
              return true;
          }
      }
      return false;
  }
  public boolean agregaryate(Yate yate)
  {
      if(listayates.contains(yate)) {
          return false;
      }
      return listayates.add(yate);
  }
  public boolean eliminarYate(String ident)
  {
      for(Yate i: listayates)
      {
          if (ident.equals(i.getNombreIdentificador()))
          {
              listayates.remove(i);
              return true;
          }

      }
      return false;
  }
  public double calcularSaldo() {
      double total = 0;
      for (Vehiculo v : listaVehiculos) {
          total += v.getPrecio();
      }
      for (Yate y : listayates)
      {
          total+= y.CalcularPrecio();
      }
      return total;
  }

}
