/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

/**
 *
 * @author Aluno
 */
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Palestra {
    
    protected String titulo;
    protected String nomePalestrante;
    protected String local;
    protected Date dataInicio;
    protected Date dataFim;
    protected LocalTime horarioInicio;
    protected LocalTime horaFim;
    protected int duracao;
    protected static int numMaxParticipantes;
    protected static int qtdParticipantes = 0;

    public static int numDeParticipantesInscritos(){
        return numMaxParticipantes-qtdParticipantes;
    }

    public void adicionarParticipante(){
        qtdParticipantes++;
    }
}
