/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Cilindro {
    
    private float raio = 0;
    private float altura = 0;

    public Cilindro() {
    }
    
    public Cilindro(float raio, float altura) throws Exception{
        if(raio <= 0) throw new Exception("O raio não pode ser menor que 0");
        this.raio = raio;
        if(altura <= 0) throw new Exception("A altura não pode ser menor que 0");
        this.altura = altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0) throw new Exception("O raio não pode ser menor que 0");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception("A altura não pode ser menor que 0");
        this.altura = altura;
    }
    
    public double calcular_volume(){
    
        return 3.1415 * raio * raio * altura;      
    }
    
    public double calcular_areaLateral(){
    
        return 2 * 3.1415 * raio * altura;
    }
    
    public double calcular_areaTotal(){
    
        return 2 * 3.1415 * raio * (raio + altura);
    }
}
