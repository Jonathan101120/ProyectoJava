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
        int acumulador_puntos_persona = 0;
        int acumulador_puntos_IA = 0;
        int[] lista_puntos_persona = new int[50];
        int[] lista_puntos_IA = new int[50];
        int resultado_dado = 0;
        int i=0,j=0;

        while(puntos_Persona<100 && puntos_IA <100){
            Scanner sc = new Scanner(System.in);
            System.out.println("Desea continuar tirando el dado [1].Si / [2].No: ");
            int continuar = sc.nextInt();

            if(continuar == 1){
                resultado_dado = dado();
                acumulador_puntos_persona += resultado_dado;
                acumulador_puntos_IA = 0;
                System.out.println("Sacaste: " + resultado_dado);

                //Guarda los puntos del dado.
                lista_puntos_persona[i] = resultado_dado;
                i++;

                if (resultado_dado != 1){
                    puntos_Persona += resultado_dado;
                }
                else {
                    puntos_Persona -= acumulador_puntos_persona;
                    continuar = 2;
                    }
            }
            if (continuar == 2) {
                acumulador_puntos_persona = 0;
                int turno_IA = 0;
                while (turno_IA <= 3) {
                    resultado_dado = dado();
                    acumulador_puntos_IA += resultado_dado;
                    lista_puntos_IA[j] = resultado_dado;
                    j++;
                    if (resultado_dado != 1) {
                         puntos_IA += resultado_dado;
                    }
                    else {
                        puntos_IA -= acumulador_puntos_IA;
                        break;
                    }
                    turno_IA++;
                    System.out.println("La IA saco: " + resultado_dado);
                }
            }
            if(continuar != 1 && continuar !=2){
                System.out.println("Ponga un numero 1 o 2.");
            }

        }
        if (puntos_Persona >= 100){
            System.out.println("Ganaste!!!");
        }
        if (puntos_IA >= 100){
            System.out.println("Te gano la IA.");
        }
    }
}
