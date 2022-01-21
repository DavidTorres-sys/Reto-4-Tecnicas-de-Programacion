
package Reto4;


public class main {

    public static void main(String[] args) {
        
        
        RegistroAlquiler datosAlquiler = new RegistroAlquiler("",0,"",0,"");
        RegistroSeguros datosSeguro = new RegistroSeguros("","");
        RegistroVehiculos datosVehiculo = new RegistroVehiculos("","","","",0,0,0);
        
        
        
         
        
         
        datosVehiculo.setIdentificador();
        datosVehiculo.setPlaca();
        datosVehiculo.setTipoVehiculo();
        datosVehiculo.setAñoModelo();
        datosVehiculo.setModelo();
        datosVehiculo.setDescripcion();
        datosVehiculo.setPrecioAlquiler();
        
        
        datosAlquiler.setTipoDocumento();
        datosAlquiler.setNumeroDocumento();
        datosAlquiler.setNombreCompletoArrendatario();
        datosAlquiler.setValorPagoAlquiler();
        datosAlquiler.setUsoDescripcion();
        datosAlquiler.setFechaInicio();
        datosAlquiler.setFechaFinal();
        
        
        
        datosSeguro.setNombreEmpresaSeguros();
        datosSeguro.setDescripcionSeguro();
        datosSeguro.setFechaInicioCover();
        datosSeguro.setFechaFinCover();
        
        
        
        System.out.println("\nDATOS DEL VEHÍCULO QUE DESEA ALQUILAR"+"\n" + "El identificador del vehículo que alquila es -"+ datosVehiculo.getIdentificador()+"- con placa "+datosVehiculo.getPlaca()
                +". Es un vehículo tipo "+ ""+datosVehiculo.getTipoVehiculo()+ " del año "+datosVehiculo.getAñoModelo()+ " marca "+ datosVehiculo.getModelo()+" el vehículo es "
                +datosVehiculo.getDescripcion()+".\nPrecio base de alquiler del vehículo es: "+ datosVehiculo.getPrecioAlquiler()+"\n\nDATOS DE LA PERSONA QUE ALQUILA"   
                + "\nTipo de documento del arrendatario es " + datosAlquiler.getTipoDocumento() + " identificado con el número "+ datosAlquiler.getNumeroDocumento()+ " y nombre "
                + " "+datosAlquiler.getNombreCompletoArrendatario() + "\nValor a pagar en total es: " + datosAlquiler.getValorPagoAlquiler()+ " y el uso que le dará es "
                +datosAlquiler.getUsoDescripcion()+"."+"\n" +"\nDATOS DEL SEGURO DEL VEHÍCULO" + "\nNombre de la empresa de seguros es "+ datosSeguro.getNombreEmpresaSeguros()
                + " y "+datosSeguro.getDescripcionSeguro()  );
        
        datosVehiculo.estadoVehículo();
        
        System.out.println("\nFecha inicio de alquiler es: "+datosAlquiler.getFechaInicio()+"Fecha vencimiento alquiler es: "+datosAlquiler.getFechaFinal());
        datosAlquiler.horasDeUso();
        datosSeguro.diasDeUsoSeguro();
       
            
}    
}
