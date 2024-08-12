/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lusra
 */
public class Paralelepipedo {
    
    public Paralelepipedo() {
    }

    public Paralelepipedo(float largura, float altura, float comprimento) throws Exception{
        if(largura <= 0) throw new Exception("A largura precisa ser maior do que 0");
        this.largura = largura;
        if(altura <= 0) throw new Exception("A altura precisa ser maior do que 0");
        this.altura = altura;
        if(comprimento <= 0) throw new Exception("O comprimento precisa ser maior do que 0");
        this.comprimento = comprimento;
    }
    
    float largura = 0;
    float altura = 0;
    float comprimento = 0;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception{
        if(largura <= 0) throw new Exception("A largura precisa ser maior do que 0");
        this.largura = largura;
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception("A altura precisa ser maior do que 0");
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception{
        if(comprimento <= 0) throw new Exception("O comprimento precisa ser maior do que 0");
        this.comprimento = comprimento;
    }
    
    public double calcular_volume(){
    
        return largura * altura * comprimento;
    }
    public double calcular_area(){
    
        return 2 * (altura * largura + altura * comprimento + largura * comprimento);
    }
 
}