/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Agenda {
    
    // Permita tanto listar todos os contatos da agenda 
    //quanto buscar um contato específico pelo seu CPF, se for pessoa física, ou pelo CNPJ, se for pessoa jurídica
    ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
    
    
    public void imprimirPessoa (Pessoa pessoa ){
        for (int i =0; i< agenda.size(); i++){
            if (pessoa.getClass() == PJ.class){
                System.out.println(((PJ) pessoa).getCNPJ ());       
            }
            else{
                System.out.println(((PF) pessoa).getCPF ());
            }
        }
        
    }
    
}
