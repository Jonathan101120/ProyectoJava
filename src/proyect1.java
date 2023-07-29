import java.util.Scanner;
import java.util.Random;

public class proyect1 {
    public static int dado(){
        // Crear una instancia de Random
        Random random = new Random();
        int min = 1;
        int max = 6;
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args){
        int puntos_Persona = 0;
        int puntos_IA = 0;
        int[] lista_puntos_persona = new int[100];

        while(puntos_Persona<100 || puntos_IA <100){
            Scanner sc = new Scanner(System.in);
            System.out.println("Desea continuar tirando el dado [S]i / [N]o: ");
            String continuar = sc.nextLine();

            if(continuar.equals("Si") || continuar.equals("si")){
                int i=0;
                int resultado_dado = dado();
                lista_puntos_persona[i] = resultado_dado;
                puntos_Persona += resultado_dado;
                i++;
            }


            puntos_IA += dado();

        }
    }
}
