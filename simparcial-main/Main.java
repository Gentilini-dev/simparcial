import Enums.CAJA;
import models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    ClaseGestora accion=new ClaseGestora();
    Auto a1=new Auto("cruze","ac301it","chevrolet",0.25,4, CAJA.MANUAL);
    Auto a2=new Auto("FORD KA ","jch421","Ford",0.25,4, CAJA.MANUAL);
    Moto m1=new Moto("Tornado","aa44d4","honda",0.1,2,250,false);
    Moto m2=new Moto("waves","aa45r","honda",0.1,2,110,true);

    Yate y=new Yate(TIPOSDEUSO.PRIVADO,25.0,"aa5d4a5df");
    Yate y3=new Yate(TIPOSDEUSO.PASEO,35.0,"hfd95df");
    Yate y2=new Yate(TIPOSDEUSO.EVENTOS,65.0,"ra94a5df");

    accion.agregarVehiculo(a1);
    accion.agregarVehiculo(a2);
    accion.agregarVehiculo(m1);
    accion.agregarVehiculo(m2);
    accion.agregaryate(y);
    accion.agregaryate(y3);
    accion.agregaryate(y2);


}
