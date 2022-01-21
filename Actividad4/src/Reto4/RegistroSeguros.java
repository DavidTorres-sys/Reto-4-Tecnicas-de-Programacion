
package Reto4;

import java.time.LocalDateTime;
import java.util.Scanner;


public class RegistroSeguros {
    
    Scanner entrada = new Scanner(System.in);
    
    private String nombreEmpresaSeguros;
    private String descripcionSeguro;
    private LocalDateTime fechaInicioCover;
    private LocalDateTime fechaFinCover;
    
    
    RegistroSeguros (String nombreEmpresaSeguros, String descripcionSeguro){
        this.nombreEmpresaSeguros = nombreEmpresaSeguros;
        this.descripcionSeguro = descripcionSeguro;
    }
    
    public String getNombreEmpresaSeguros(){
        return this.nombreEmpresaSeguros;
    }
    public void setNombreEmpresaSeguros(){
        System.out.println("Ingresar el nombre de la empresa de seguro del vehiculo alquilado");
        this.nombreEmpresaSeguros = entrada.nextLine();
    }
    
    
    public String getDescripcionSeguro(){
        return this.descripcionSeguro;
    }
    public void setDescripcionSeguro(){
        System.out.println("Ingresar la descripción de la empresa del seguro de su vehículo alquilado");
        this.descripcionSeguro = entrada.nextLine();
    }
    
    
    //FECHAS
    public LocalDateTime getFechaInicioCover(){
        return this.fechaInicioCover;
    }
    public void setFechaInicioCover(){
        System.out.println("Ingrese la fecha del inicio del seguro en formato (yyyy-mm-ddThora:minuto:segundo)");
        String fechaHoraTexto = entrada.nextLine();
        LocalDateTime fechaHoraComienzo = LocalDateTime.parse(fechaHoraTexto);
        this.fechaInicioCover = fechaHoraComienzo;
    }
    
    
    public LocalDateTime getFechaFinCover(){
        return this.fechaFinCover;
    }
    public void setFechaFinCover(){
        
        
        System.out.println("Ingrese la fecha en formato del fin del seguro en formato (yyyy-mm-ddThora:minuto:segundo)");
        String fechaHoraTexto2 = entrada.nextLine();
        LocalDateTime fechaHoraFinal = LocalDateTime.parse(fechaHoraTexto2);
        this.fechaInicioCover = fechaHoraFinal;
    }
    
    //FECHAS
    
    //METODOS
    
    public int diasDeUsoSeguro(){
        
       int diaDeMes1 = this.fechaInicioCover.getDayOfMonth();
        int diaDeMes2 = this.fechaInicioCover.getDayOfMonth();
        int mes1 = this.fechaInicioCover.getMonthValue();
        int mes2 = this.fechaInicioCover.getMonthValue();
        int horas1 = this.fechaInicioCover.getHour();
        int horas2 = this.fechaInicioCover.getHour();
        int minutos1 = this.fechaInicioCover.getMinute();
        int minutos2 = this.fechaInicioCover.getMinute();
        
        
        int resultadoDiaMes = diaDeMes2-diaDeMes1;
            if(resultadoDiaMes<0){
                resultadoDiaMes = 31+ resultadoDiaMes;
            }
                 resultadoDiaMes = diaDeMes2-diaDeMes1; 
            
        int resultadoMes = mes2-mes1;
            resultadoMes = resultadoMes*31;
            

            resultadoDiaMes = resultadoMes+resultadoDiaMes;
            System.out.println("El número de días que usted alquiló el vehículo fue: "+resultadoDiaMes+" días");
            return resultadoDiaMes;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
