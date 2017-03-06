public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String ip;
    private String web;
    private int codhttp;
        
    public Acceso(String entradaLog)
    {
        
       entradaLog = entradaLog.replace("[","");
       entradaLog = entradaLog.replace("]","");
        
       String entradasLog[] = entradaLog.split(" ");
        
       ip = entradasLog[0];  
       ano = Integer.parseInt(entradasLog[1]);
       mes = Integer.parseInt(entradasLog[2]);
       dia = Integer.parseInt(entradasLog[3]);
       hora = Integer.parseInt(entradasLog[4]);
       minutos = Integer.parseInt(entradasLog[5]);
       web = entradasLog[6];
       codhttp = Integer.parseInt(entradasLog[7]);
       
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
    
    public String getWeb()
    {
        return web;
    }
    
    public String getIP()
    {
        return ip;
    }
    
    public int getHTTPCode()
    {
        return codhttp;
    }
    
}