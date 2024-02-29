import java.util.Scanner;
 
public class Licao2 {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
 
        String [][] login = {{"mar","a"},
                            {"ju", "b"},
                            {"ana", "c"},
                            {"mari","d"},
                            {"j", "e"},
                            {"an", "f"}};
           
        while(true){
        System.out.print("Digite o login: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
       
        for (String[] usuario : login){
            if(usuario[0].equals(email) && usuario[1].equals(senha)){
                System.out.println("Seu login está correto ");
            return;
 
            } } 
                System.out.println("Seu login está errado! Por favor, tente novamente.");
            }
        }
    }
