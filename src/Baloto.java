
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Baloto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("BALOTO");
        System.out.println("");
        System.out.println("¿Cuantos Van a Jugar?");
        Scanner leer = new Scanner(System.in);
        int nJugadores = leer.nextInt();
        int k = 1;
        while (k <= nJugadores) {
            Jugador j = new Jugador();
            System.out.println("Jugador " + k);
            j.LeerNumeros();
            j.Jugar();
            k = (k + 1);
        }


        
        
    }
    
}
