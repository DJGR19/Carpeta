
//Agregar carpetas y archvos desde instancia raíz
//El menú sería como el siguiente; 1. Agregar Carpeta \n 
//2. Agregar Archivo ------(De opción 2: 1. Agregar archivo sistema
//\n 2. Agregar archivo de Usuario n\ Seleccione Opción 



package Carpetas2;

public class Objeto {
    
    String nombre;
    int tamanio;
    
    public Objeto(){
    
}
    public Objeto(String nombre, int tamanio){
        this.nombre=nombre;
        this.tamanio= -1;
        
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
}
