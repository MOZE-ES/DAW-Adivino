import java.util.Scanner;

/**
 * 
 * @version 1.0
 * @author Mindo
 * El proyecto plantea un juego: adivinar el n�mero que genera de manera aleatoria el programa. 
 * 
 */
public class Aciertos {

    /**
     * Este metodo es el que genera un n�mero y pide al usuario que lo acierte.
     * @param n Es INT y es el n�mero introducido por el usuario
     * @param cont Es INT y es el contador de cuantas veces ha tenido que introducir el n�mero hasta acertar cual es.
     * @param x es INT y es el n�mero generado por el programa, el n�mero m�ximo sera 500
     * @param args 
     */
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } 
        /**
         * Cuando el valor del n�mero introducido sea igual al n�mero generado por el programa
         * nos sacara del bucle y nos mostrar� que hemos acertado y el numero de intentos.
         */
        
        while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
        
    }
}
