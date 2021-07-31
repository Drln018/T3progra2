/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Darlin
 */
public class Vendedores {
    private String nombre;
    private int enero;
    private int febrero;
    private int marzo;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEnero(){
        return enero;
    }
    
    public void setEnero(int enero){
        this.enero=enero;
    }
    public int getFebrero(){
        return febrero;
    }
    
    public void setFebrero(int febrero){
        this.febrero=febrero;
    }
    public int getMarzo(){
        return marzo;
    }
    
    public void setMarzo(int marzo){
        this.marzo=marzo;
    }
  
}
