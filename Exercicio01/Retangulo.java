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
public class Retangulo extends Figura{
    protected int lado; 
    protected int altura;
    
    public void calculoArea (){
        this.area = this.lado*this.altura;
    }
}
