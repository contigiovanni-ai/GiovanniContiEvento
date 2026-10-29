/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contigiovannievento;

/**
 *
 * @author conti.giovanni
 */
public class ContiGiovanniEvento
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Evento e1 = new Evento("Sagra della porchetta", 0, 1000, 3.50);
        Evento e2 = new Evento("Sagra delle castagne", 100, 200, 2.50);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println("La vendita di 2000 biglietti per " + e1.getNomeEvento() + " e' andata a buon fine? " + e1.vendiBiglietti(2000));
        System.out.println("La vendita di 100 biglietti per " + e2.getNomeEvento() + " e' andata a buon fine? " + e2.vendiBiglietti(100));
        e1.ristampaBiglietti(500);
        e2.ristampaBiglietti(200);
        System.out.println("La " + e1.getNomeEvento() + " e la " + e2.getNomeEvento() + " sono eventi uguali? " + e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
