import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        if (numero>0){
            System.out.println("Numero positivo!");
        } else{
            System.out.println("Numero negativo!");
        }
    }
}
