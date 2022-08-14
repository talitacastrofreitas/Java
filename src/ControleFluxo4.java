public class ControleFluxo4 {
    /* ESTRUTURAS DE REPETIÇÕES
     estrutura de repetição que executa,
    repetidamente, uma única instrução ou um bloco delas
    “enquanto” uma expressão booleana for verdadeira.*/
    public static void main(String[] args) {
        int contador =0;
        while(contador<10) {
            System.out.println(++contador);
        }
        /*a diferença entre do e while é que independentemente se a condiçao for verdadeira ou não,
        será executado ao menos uma vez*/
        do {
            System.out.println("dentro do do while");
        } while(contador<10);

        for (int i =0; i<10;++i) {
            System.out.println("O valor de i e: "+i);
        }
    }
}
