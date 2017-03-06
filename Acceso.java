public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    public Acceso(String entradaLog)
    {
        
        
        String entradasLog[] = entradaLog.split(" ");
        
        
        this.ano = Integer.parseInt(entradasLog[0]);
        this.mes = Integer.parseInt(entradasLog[1]);
        this.dia = Integer.parseInt(entradasLog[2]);
        this.hora = Integer.parseInt(entradasLog[3]);
        this.minutos = Integer.parseInt(entradasLog[4]);
    }
    
    public int getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
}