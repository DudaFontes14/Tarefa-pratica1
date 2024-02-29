import java.util.Scanner; 
      
public class Licao3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
 
   
            System.out.print("Digite o número de linhas da matriz: ");
            int l = scan.nextInt();
            System.out.print("Digite o número de colunas da matriz: ");
            int c = scan.nextInt();
            int[][] m = new int[l][c];
   
           
            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    m[i][j] = scan.nextInt();
                } 

            } 

            System.out.println("Matriz Transposta:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println(); 
        }
        }
   }  
            
    

