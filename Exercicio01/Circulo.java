/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author Aluno
 */
public class Circulo extends Figura{
    protected float pi= (float) 3.14;
    protected float raio;
    
    public void calculoArea (){
        this.area = this.raio*this.raio*this.pi;
    }
}
