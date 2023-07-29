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
        int[] lista_puntos_persona = new int[50];
        int[] lista_puntos_IA = new int[50];
        int i=0,j=0;
        boolean tag = true;

        while(puntos_Persona<20 || puntos_IA <20){
            Scanner sc = new Scanner(System.in);
            System.out.println("Desea continuar tirando el dado [1].Si / [2].No: ");
            int continuar = sc.nextInt();

            if(continuar == 1){
                int resultado_dado = dado();
                int puntos_per=0;
                puntos_per += resultado_dado;
                System.out.println("Sacaste: "+resultado_dado);
                if (resultado_dado != 1){
                    lista_puntos_persona[i] = resultado_dado;
                    puntos_Persona += resultado_dado;
                    i++;
                }
                else {
                    lista_puntos_persona[i] = 0;
                    puntos_Persona -= puntos_per;
                    int turno_IA = 0;
                    int puntos_acumulados_IA = 0;
                    while (turno_IA <= 3) {
                        int resultado_dado_IA = dado();
                        puntos_acumulados_IA += resultado_dado_IA;
                        if (resultado_dado_IA == 1) {
                            lista_puntos_IA[j] = 0;
                            puntos_IA -= puntos_acumulados_IA;
                            turno_IA = 4;
                        } else
                            lista_puntos_persona[j] = resultado_dado_IA;
                        puntos_IA += resultado_dado_IA;
                        j++;
                        turno_IA++;
                        System.out.println("La IA saco: " + resultado_dado_IA);
                    }
                }
            }
            else if (continuar == 2){
                int turno_IA = 0;
                int puntos_acumulados_IA = 0;
                while(turno_IA <= 3){
                    int resultado_dado_IA = dado();
                    puntos_acumulados_IA += resultado_dado_IA;
                    if (resultado_dado_IA == 1){
                        lista_puntos_IA[j] = 0;
                        puntos_IA -=puntos_acumulados_IA;
                        turno_IA=4;
                    }
                    else
                        lista_puntos_persona[j] = resultado_dado_IA;
                        puntos_IA += resultado_dado_IA;
                        j++;
                    turno_IA++;
                    System.out.println("La IA saco: "+ resultado_dado_IA);
                }
            }
            else
                System.out.println("Ponga un numero 1 o 2.");
        }
        if (puntos_Persona >= 100){
            System.out.println("Ganaste!!!");
        }
        if (puntos_IA >= 100){
            System.out.println("Te gano la IA.");
        }
    }
}
