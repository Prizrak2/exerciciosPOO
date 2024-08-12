/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Cone {

    public Cone() {
    }
    
    public Cone(float altura, float raio) throws Exception{
        if(altura <= 0) throw new Exception("A altura precisa ser maior do que 0");
        this.altura = altura;
        if(raio <= 0) throw new Exception("O raio precisa ser maior do que 0");
        this.raio = raio;
    }
    
    private float altura = 0;
    private float raio = 0;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception("A altura precisa ser maior do que 0");
        this.altura = altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0) throw new Exception("O raio precisa ser maior do que 0");
        this.raio = raio;
    }
    
    public double calcular_geratriz(){
    
        return Math.sqrt((altura * altura) + (raio * raio));
    }
    
    public double calcular_areaLateral(){
    
        return 3.1415 * raio * calcular_geratriz();
    }
    
    public double calcular_areaTotal(){
    
        return 3.1415 * raio * (calcular_geratriz() + raio);
    }
    
    public double calcular_volume(){
    
        return 1.0/3.0 * 3.1415 * (raio * raio) * altura;
    }
}
