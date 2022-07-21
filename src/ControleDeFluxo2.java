public class ControleDeFluxo2 {
    public static void main(String[] args) {
        //Operadores tenários.
        int idade = 15;
        String status;
        status = idade <15 ? "Infantil": idade>=15 && idade<18 ? "Juvenil" : "Adulto";
        System.out.println(status);

    }
}
