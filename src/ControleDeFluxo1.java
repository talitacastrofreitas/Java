/*public class ControleDeFluxo1 {
    public static void main(String[] args) {
       int idade = 15;
        if (idade>= 18){
            System.out.println("entrou no clube");
        }else {
            System.out.println ("Não apto para entrar no clube");
        }
    }
}

   */
//idade < 15 categoria infantil
//idade < 15 && idade <=18 juvenil
//idade >= 18 adulto

public class ControleDeFluxo1 {
    public static void main (String [] args) {
        int idade = 14;
        if (idade <15) {
            System.out.println ("categoria infantil");
        }else if (idade >=15 && idade<18){
            System.out.println ("categoria juvenil");
        }else {
            System.out.println ("categoria adulto");
        }
    }
}