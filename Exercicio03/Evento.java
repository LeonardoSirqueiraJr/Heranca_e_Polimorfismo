
package Exercicio03;

import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;

public class Evento {

    protected Date dataInicio;
    protected Date dataFim;
    protected LocalTime horarioDeInicio;
    protected LocalTime horarioDeFim;
    protected static int numPalestras=0;
    protected static int participantes=0;
    protected static ArrayList<Palestra> listaPalestras = new ArrayList<Palestra>();
    protected static ArrayList<Inscricao> listaInscricao = new ArrayList<Inscricao>();
    protected static ArrayList<Participante> listaParticipanteEvento = new ArrayList<Participante>();
    private static Evento instancia; //verificar se tem mais do que um evento


    private Evento(){};
    public static Evento getInstance(){
        if(instancia==null){
            synchronized(Evento.class){
                if(instancia==null){
                    instancia=new Evento();
                }
            }
        }
        return instancia;
    }

    private Evento(Date datai,Date dataf,LocalTime horarioi,LocalTime horariof){
        this.dataInicio=datai;
        this.dataFim=dataf;
        this.horarioDeInicio=horarioi;
        this.horarioDeFim=horariof;
    }

    public void criarPalestra(String titulo,String nomepalestrante, String local,Date datai,LocalTime horarioi,int duracao){
        numPalestras++;
        listaPalestras.get(numPalestras-1).titulo=titulo;
        listaPalestras.get(numPalestras-1).nomePalestrante=nomepalestrante;
        listaPalestras.get(numPalestras-1).local=local;
        listaPalestras.get(numPalestras-1).dataInicio=datai;
        listaPalestras.get(numPalestras-1).horarioInicio=horarioi;
        listaPalestras.get(numPalestras-1).duracao=duracao;

    }

    public static void adicionarParticipantes(String nome, String matricula, String email){
        participantes++;
        listaParticipanteEvento.get(participantes-1).inscreverParticipante(nome,email,matricula);

    }

    public static void adicionarEmPalestra(Palestra p,Participante pr){
        Inscricao.codigo++;
        p.adicionarParticipante();
        listaInscricao.get(Inscricao.codigo-1).palestra=p;
        listaInscricao.get(Inscricao.codigo-1).participante=pr;
    }

    public void verificarPalestras(Participante p){
        for(int i=0;i<listaInscricao.size();i++){
            if(p==listaInscricao.get(i).participante){
                System.out.println("O participante está inscritos na palestra "+listaInscricao.get(i).palestra);
            }
        }
    }

    public void listarPalestras(){
        Palestra p;
        for(int i=0;i<listaPalestras.size();i++){
            System.out.println("titulo"+listaPalestras.get(i).titulo);
            p=listaPalestras.get(i);
            for(int j=0;j<listaInscricao.size();j++){
                if(p==listaInscricao.get(i).palestra){
                    System.out.println(listaInscricao.get(i).participante.nome);
                }
            }
        }
    }

}
