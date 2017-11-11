




 //Búsqueda de archivos y carpetas según el nombre (CON RECURSIVIDAD)


package Carpetas2;
import java.util.ArrayList;

 


public class Directorio extends Objeto{
    String permisos; // Este permiso es para poder ingresar al escritorio like a psw;
    ArrayList<Objeto> obj;

    
  public Directorio(String nombre, int tamanio, String permisos, ArrayList<Objeto> obj)  {
      
      super(nombre, tamanio);
    this.permisos=permisos;
    this.obj=obj;
   
  
}
  public  Directorio(){
       nombre = "";
       tamanio=-1;
     obj=null;
    permisos="RWX-";
    
    
    
}
   
  
public Directorio Buscar_ArchiCarp(String nombre){
    
   
   if(nombre.equals(this.nombre))
            return this;
        
        if(this.obj == null)
            return null;
        else
        {
            for(int i = 0; i < obj.size(); i++)
            {
                
                Directorio tmp =  obj.get(i);// DUDEEEEEE*****
                tmp = tmp.Buscar_ArchiCarp(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        /*
         if(pos < cuentas.size()){
            CuentaBancaria c = cuentas.get(pos);
            if(c.getNumero() == cod)
                return c;
            return search(cod, pos+1);
        }
        return null;
    }
        */
        return null;
   
   
}
  
  

    
}
