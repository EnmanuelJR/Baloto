
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
public class Jugador {

    int p1;
    int p2;
    int p3;
    int p4;
    int p5;
    int p6;
    int premio;
    String nombre;

    void LeerNumeros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su nombre");
        nombre = leer.next();
        System.out.println("");
        System.out.println("Digite 6 numeros");
        System.out.println("");
        System.out.println("Primer Numero");
        p1 = leer.nextInt();
        System.out.println("Segundo Numero");
        p2 = leer.nextInt();
        System.out.println("Tercer Numero");
        p3 = leer.nextInt();
        System.out.println("Cuarto Numero");
        p4 = leer.nextInt();
        System.out.println("Quinto Numero");
        p5 = leer.nextInt();
        System.out.println("Sexto Numero");
        p6 = leer.nextInt();
    }

    void Jugar() {
        Random r = new Random();
        int n1 = r.nextInt(45) + 1;

        int rep = 0;
        while (rep == 0) {
            int n2 = r.nextInt(45) + 1;
            if (n2 == n1) {
                rep = 0;
            } else {
                int n3 = r.nextInt(45) + 1;
                if (n3 == n1 || n3 == n2) {
                    rep = 0;
                } else {
                    int n4 = r.nextInt(45) + 1;
                    if (n4 == n1 || n4 == n2 || n4 == n3) {
                        rep = 0;
                    } else {
                        int n5 = r.nextInt(45) + 1;
                        if (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4) {
                            rep = 0;
                        } else {
                            int n6 = r.nextInt(45) + 1;
                            if (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5) {
                                rep = 0;
                            } else {
                                System.out.println("Los numeros Ganadores son: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

                                if (p1 == n1 || p1 == n2 || p1 == n3 || p1 == n4 || p1 == n5 || p1 == n6) {
                                    premio = (premio + 1);
                                }
                                if (p2 == n1 || p2 == n2 || p2 == n3 || p2 == n4 || p2 == n5 || p2 == n6) {
                                    premio = (premio + 1);
                                }
                                if (p3 == n1 || p3 == n2 || p3 == n3 || p3 == n4 || p3 == n5 || p3 == n6) {
                                    premio = (premio + 1);
                                }
                                if (p4 == n1 || p4 == n2 || p4 == n3 || p4 == n4 || p4 == n5 || p4 == n6) {
                                    premio = (premio + 1);
                                }
                                if (p5 == n1 || p5 == n2 || p5 == n3 || p5 == n4 || p5 == n5 || p5 == n6) {
                                    premio = (premio + 1);
                                }
                                if (p6 == n1 || p6 == n2 || p6 == n3 || p6 == n4 || p6 == n5 || p6 == n6) {
                                    premio = (premio + 1);
                                }

                                System.out.println("Señor: "+nombre+" Ud acerto " + premio + " numeros");

                                if (premio == 6) {
                                    System.out.println("FELICIDADES!!! UD SE HA GANADO EL PREMIO MAYOR");
                                    System.out.println("");
                                } else if (premio == 4 || premio == 5) {
                                    System.out.println("FELICIDADES!!! UD SE HA GANADO EL PREMIO SECUNDARIO");
                                    System.out.println("");
                                } else if (premio == 3) {
                                    System.out.println("SE LIBRO EL JUEGO");
                                    System.out.println("");
                                } else {
                                    System.out.println("Lo sentimos. No ha ganado nada");
                                    System.out.println("");
                                }
                            }
                            rep = 1;
                        }
                    }
                }
            }
        }
    }


}
