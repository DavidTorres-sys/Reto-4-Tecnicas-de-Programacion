
package Reto4;

import java.util.Scanner;

public class RegistroVehiculos {
    
    Scanner entrada = new Scanner(System.in);
    
    
    private String placa;
    private String descripcion;
    private String tipoVehiculo;
    private String modelo;
    private int añoModelo;
    private double precioAlquiler;
    private static int identificador;
    
    
    RegistroVehiculos ( String placa, String descripcion, String tipoVehiculo,String modelo, int añoModelo,double precioAlquiler, int identificador){
        
        this.placa = placa;
        this.descripcion = descripcion;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
        this.añoModelo =  añoModelo;
        this.precioAlquiler = precioAlquiler;
        this.identificador = identificador;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca (){
        System.out.println("Ingrese la placa del vehículo");
        this.placa = entrada.nextLine();
    }
    
    
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion (){
        System.out.println("Ingrese la descrpción del vehículo");
        this.descripcion = entrada.nextLine();
    }
    
    
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }
    public void setTipoVehiculo(){
        System.out.println("Ingrese el tipo de vehículo eléctrico que desea alquilar (Motocicleta/Automóvil/Camioneta)");
        this.tipoVehiculo = entrada.nextLine();
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(){
        System.out.println("Ingrese la marca del vehículo");
        this.modelo = entrada.nextLine();
    }
    
    
    public double getAñoModelo(){
        return this.añoModelo;
    }
    public void setAñoModelo(){
        System.out.println("Ingrese el año del modelo del vehículo");
        this.añoModelo = entrada.nextInt();
        entrada.nextLine();
    }
    
    
    public double getPrecioAlquiler(){
        return this.precioAlquiler;
    }
    public void setPrecioAlquiler(){
        System.out.println("Ingrese el precio del alquiler del vehículo por hora");
        this.precioAlquiler = entrada.nextDouble();
        entrada.nextLine();
    }
    
    
    public int getIdentificador(){
        return this.identificador;
    }
    public void setIdentificador(){
        System.out.println("Ingrese el número identificador del vehículo");
        this.identificador = entrada.nextInt();
        entrada.nextLine();
    }
    
    //MÉTODOS
    
    public String estadoVehículo(){
        if (this.añoModelo>2021){
            System.out.println("El vehículo es nuevo");
        }
        else if (this.añoModelo<2021 && this.añoModelo>2018 ){
            System.out.println("El vehículo es medianamente usado");
        }
        else if (this.añoModelo<2018){
            System.out.println("El vehículo es usado");
        }
        
        
        
        return null;
            
    }
    
    
    
    
    
    
    
    
}

