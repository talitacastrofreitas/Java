public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        /* Crie uma variavel salario e imprima seu imposto
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salario > 5000 20%
         */
        double salario = 1000;
        if (salario < 1000) {
            System.out.println(salario * 5/100);
        } else if (salario >= 1000 && salario < 2000) {
            System.out.println(salario * 10/100);
        } else if (salario >= 2000 && salario < 4000) {
            System.out.println(salario * 15/100);
            } else{
            System.out.println(salario * 20/100);

            }
        }
    }


