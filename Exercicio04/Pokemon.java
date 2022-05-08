package Exercicio04;

import java.util.ArrayList;

public class Pokemon {
    protected String nome;
    protected String tipo;
    protected float tamanho;
    protected float peso;
    protected float xp;
    protected Stats stats=new Stats();
    protected ArrayList<Ataque> ataques=new ArrayList<Ataque>();


    public void evolucao(Stats statsEvolucao, float tamanho, float peso){
        if(this.xp>=100){
            this.xp=0;
            this.stats=new Stats();
            this.tamanho=tamanho;
            this.peso=peso;
        }
        else
            System.out.println("Não há experiência necesséria");
    }

}
