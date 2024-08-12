/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Retangulo {
    
    float comprimento;
    float largura;
    
    public float getComprimento(){
        return this.comprimento;
    }
    
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    
    public float getLargura(){
        return this.largura;
    }
    
    public void setLargura(float largura){
        this.largura = largura;
    }
    
    public double calcular_area(float largura, float comprimento){
    
        return largura * comprimento;
    }
    
    public double calcular_perimetro(float largura, float comprimento){
    
        return (2 * largura) + (2 * comprimento);
    }
}
