public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //  =, -=, +=,*=, /=, %=
        int salario=1800;
        salario *=0.1;
        salario = salario + (int)(salario*0.1);
        int numero = 11;
        numero %=2;
        System.out.println(numero);
    }
}

