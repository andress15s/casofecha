package modelo;

public class Fecha 
{
    // Atributos
    private int dia;
    private int mes;
    private int anio;


    // Constructor
    public Fecha()
    {
        dia = 0;
        mes = 0;
        anio = 0;
    }

    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //constructor con parametro String (dd/mm/aaaa)
    public Fecha(String s)
    {
        //Buscamos la primera ocurrencia de /
        int pos1 = s.indexOf('/');

        //Buscamos la ultima ocurrencia de /
        int pos2 = s.lastIndexOf('/');

        //Extraemos el dia
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

      //Extraemos el mes
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        //Extraemos el año
        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
        

    }
    


    //metodos

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getDia()
    {
        return this.dia;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getMes()
    {
        return this.mes;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getAnio()
    {
        return this.anio;
    }

    public String toString()
    {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }
    

    //metodo equals
    public boolean equals(Object o)
    {
      
            Fecha otra = (Fecha)o;
            return(dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio); 
    }

    


    
}
