import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static final int TAMANHO = 1000000;

    static Pessoa[] arrayGrandeDePessoas() {
        return Gerador.criarArrayPessoas(TAMANHO);
    }


    static ArrayList<Pessoa> meusAmigos() {
        ArrayList<Pessoa> result = new ArrayList<>();

        for (int i = 0; i < TAMANHO; i++) {
            result.add(Gerador.gerarPessoa(i));
        }
        return result;
    }


    static LinkedList<Pessoa> meusColegas() {
        LinkedList<Pessoa> result = new LinkedList<>();

        for (int i = 0; i < TAMANHO; i++) {
            result.add(Gerador.gerarPessoa(i));
        }

        return result;
    }


    static long[] medirTemposIntroducao() {

        // implementação aqui

        return new long[]{};
    }


    static long[] medirTemposIntroducaoNoInicio() {

        // implentação aqui

        return new long[]{};
    }


    static long[] medirTemposIntroducaoNoMeio() {

        // implementação aqui

        return new long[]{};
    }


    static long[] medirTemposIntroducaoNoFim() {

        // implentação aqui

        return new long[]{};
    }


    public static void main(String[] args) {
    }


}
