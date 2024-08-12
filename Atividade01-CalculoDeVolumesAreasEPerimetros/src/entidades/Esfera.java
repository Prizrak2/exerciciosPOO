/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Esfera {
    
    private float raio;
    
    public float getRaio(){
        return this.raio;
    }
    
    public void setRaio(float raio){
        this.raio = raio;
    }
    
    public double calcular_volume(float raio){
    
        return (4/3) * 3.1415 * (raio * raio * raio);      
    }
    
    public double calcular_area(float raio){
    
        return 4 * 3.1415 * (raio * raio);
    }
    
}
