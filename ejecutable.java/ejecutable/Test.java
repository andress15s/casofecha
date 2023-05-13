package ejecutable;

import modelo.Fecha;

public class Test 
{   
   
        public static void main(String[] args) 
        {
            Fecha f = new Fecha(11, 5, 2023);
            f.setDia(11);
            f.setMes(5);
            f.setAnio(2023);
    
            System.out.println("Fecha 1");
            System.out.println("Dia: " + f.getDia());
            System.out.println("Mes: " + f.getMes());
            System.out.println("Año: " + f.getAnio());
            System.out.println(f);
            System.out.println("///////////////////////////////");

            Fecha f2 = new Fecha(11, 5, 2023);
            f2.setDia(11);
            f2.setMes(5);
            f2.setAnio(2023);

            System.out.println("Fecha 2");
            System.out.println("Dia: " + f2.getDia());
            System.out.println("Mes: " + f2.getMes());
            System.out.println("Año: " + f2.getAnio());
            System.out.println(f2);



            System.out.println(f.equals(f2) ? "Son iguales las fechas " : "Son distintos las fechas ");

    
            
        }
        
    
}
