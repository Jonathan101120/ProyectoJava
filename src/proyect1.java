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
        int[] lista_puntos_IA = new int[100];
        int i=0,j=0;

        while(puntos_Persona<100 || puntos_IA <100){
            Scanner sc = new Scanner(System.in);
            System.out.println("Desea continuar tirando el dado [S]i / [N]o: ");
            String continuar = sc.nextLine();

            if(continuar.equals("Si") || continuar.equals("si")){
                int resultado_dado = dado();
                int puntos_per=0;
                puntos += resultado_dado;
                if(resultado_dado == 1){
                    lista_puntos_persona[i] = 0;
                    puntos_Persona -= puntos_per;
                    continuar = "No";
                }
                else {
                    lista_puntos_persona[i] = resultado_dado;
                    puntos_Persona += resultado_dado;
                    i++;
                }
            }
            else{
                int resulado_dado_IA = dado();
                int turno_IA = 0;
                int puntos_acumulados_IA = 0;
                while(turno_IA <= 3){
                    if (resulado_dado_IA == 1){
                        lista_puntos_persona[j] = 0;

                        turno_IA=4;
                    }
                    else
                        lista_puntos_persona[j] = resulado_dado_IA;

                    puntos_IA += resulado_dado_IA;
                    turno_IA++;
                    j++;
                }
            }

        }
    }
}
