package Programa;
import java.util.Scanner;

import classes.Aeronave;
import classes.Pessoa;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
    
    Aeronave nave = new Aeronave ("0022N", null);
    Pessoa piloto = new Pessoa (nave);

    System.out.println ("PILOTO: Senhores passageiros, preparence pois estamos prestes a pousar!");    
    System.out.println ("AEROMOÇAS: Coloquem seus cintos!!!");

    sc.close();
    }
}
