/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Piramide {
    
    float base;
    float altura;
    
    public float getBase(){
        return this.base;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    
    public double calcular_volume(double base, double altura){
    
        return (1.0/3.0) * base * altura;
    }
 
}