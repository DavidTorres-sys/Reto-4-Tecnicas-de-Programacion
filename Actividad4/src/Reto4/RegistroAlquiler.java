
package Reto4;



import java.time.LocalDateTime;
import java.util.Scanner;


public class RegistroAlquiler {
    
    Scanner entrada = new Scanner(System.in);
    
    private String tipoDocumento;
    private int numeroDocumento;
    private String nombreCompletoArrendatario;
    private double valorPagoAlquiler;
    private String usoDescripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;

    
    RegistroAlquiler(String tipoDocumento,int numeroDocumento,String nombreCompletoArrendatario,double valorPagoAlquiler,String usoDescripcion){
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompletoArrendatario = nombreCompletoArrendatario;
        this.valorPagoAlquiler = valorPagoAlquiler;
        this.usoDescripcion = usoDescripcion;
    }
    
   //ATRIBUTOS
 
    public String getTipoDocumento(){
        return this.tipoDocumento;
    }
    public void setTipoDocumento (){
        System.out.println("Ingrese su tipo de documento (CC/NIP/TI) : ");
        this.tipoDocumento = entrada.nextLine();
    }
    
    
    public int getNumeroDocumento(){
        return this.numeroDocumento;
    }
    public void setNumeroDocumento(){
        System.out.println("Ingrese el número de su documento");
        this.numeroDocumento = entrada.nextInt();
        entrada.nextLine();
    }
    
    
    public String getNombreCompletoArrendatario(){
        return this.nombreCompletoArrendatario;
    }
    public void setNombreCompletoArrendatario(){
        System.out.println("Ingrese su nombre completo");
        this.nombreCompletoArrendatario = entrada.nextLine();
    }
    
    
    public double getValorPagoAlquiler(){
        return this.valorPagoAlquiler;
    }
    public void setValorPagoAlquiler(){
        System.out.println("Ingresar el valor a pagar del alquiler del vehiculo");
        this.valorPagoAlquiler = entrada.nextDouble();
        entrada.nextLine();
    }
    
    
    String getUsoDescripcion(){
        return this.usoDescripcion;
    }
    public void setUsoDescripcion(){
        System.out.println("Ingresar que uso le dará al vehículo");
        this.usoDescripcion = entrada.nextLine();
    }
    
    //FECHAS  
    public LocalDateTime getFechaInicio(){
        return this.fechaInicio;
    }
    public void setFechaInicio(){
        System.out.println("Ingrese la fecha de inicio del vehículo que alquiló en formato (yyyy-mm-ddThora:minuto:segundo)");
        String fechaHoraTexto = entrada.nextLine();
        LocalDateTime fechaHoraComienzo = LocalDateTime.parse(fechaHoraTexto);
        this.fechaInicio = fechaHoraComienzo;
    }
    
    
    public LocalDateTime getFechaFinal(){
        return this.fechaFinal;
    }
    public void setFechaFinal(){
        
        
        System.out.println("Ingrese la fecha de vencimiento del vehículo que alquiló en formato (yyyy-mm-ddThora:minuto:segundo)");
        String fechaHoraTexto2 = entrada.nextLine();
        LocalDateTime fechaHoraFinal = LocalDateTime.parse(fechaHoraTexto2);
        this.fechaFinal = fechaHoraFinal;
    }
    
    //METODOS
    
    public int horasDeUso(){
        
       int diaDeMes1 = this.fechaInicio.getDayOfMonth();
        int diaDeMes2 = this.fechaFinal.getDayOfMonth();
        int mes1 = this.fechaInicio.getMonthValue();
        int mes2 = this.fechaFinal.getMonthValue();
        int horas1 = this.fechaInicio.getHour();
        int horas2 = this.fechaFinal.getHour();
        int minutos1 = this.fechaInicio.getMinute();
        int minutos2 = this.fechaFinal.getMinute();
        
        
        int resultadoDiaMes = diaDeMes2-diaDeMes1;
            if(resultadoDiaMes<0){
                resultadoDiaMes = 31+ resultadoDiaMes;
            }
            resultadoDiaMes = 24*resultadoDiaMes;
        
            
        int resultadoMes = mes2-mes1;
            resultadoMes = 730* resultadoMes;
            
            
        int resultadoHoras = horas2-horas1;
            if(resultadoHoras<0){
                   resultadoHoras = 24+resultadoHoras;
            }
      
        
         
        int resultadoMinutos = minutos2-minutos1;
            if(resultadoMinutos<0){
                resultadoMinutos = 60 + resultadoMinutos;
            }
         resultadoMinutos = resultadoMinutos/60;
            

            resultadoHoras = resultadoDiaMes+resultadoMes+resultadoMinutos+resultadoMinutos;
            System.out.println("El número de horas que usted alquiló el vehículo fue de: "+resultadoHoras);
        return 0;
        
    }
   
    
    
    
    
}
