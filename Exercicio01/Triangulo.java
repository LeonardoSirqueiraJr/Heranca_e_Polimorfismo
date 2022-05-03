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
public class Triangulo extends Figura{
    protected int altura;
    protected int base;
    
    public void calculoArea (){
        this.area = (this.base*this.altura)/2;
    }    
    
}
