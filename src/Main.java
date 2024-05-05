import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static final int TAMANHO = 1000000;

    static Pessoa[] f01() {
        return Gerador.criarArrayPessoas(TAMANHO);
    }


    static ArrayList<Pessoa> f02() {
        ArrayList<Pessoa> result = new ArrayList<>();

        for (int i = 0; i < TAMANHO; i++) {
            result.add(Gerador.gerarPessoa(i));
        }
        return result;
    }


    static LinkedList<Pessoa> f03() {
        LinkedList<Pessoa> result = new LinkedList<>();

        for (int i = 0; i < TAMANHO; i++) {
            result.add(Gerador.gerarPessoa(i));
        }

        return result;
    }


    static long[] f04() {

        // implementação aqui

        return new long[]{};
    }


    static long[] f05() {

        // implentação aqui

        return new long[]{};
    }


    static long[] f06() {

        // implementação aqui

        return new long[]{};
    }


    static long[] f07() {

        // implentação aqui

        return new long[]{};
    }


    public static void main(String[] args) {
    }


}
