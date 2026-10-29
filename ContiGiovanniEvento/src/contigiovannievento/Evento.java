/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contigiovannievento;

import java.util.Objects;

/**
 *
 * @author conti.giovanni
 */
public class Evento
{
    private String nomeEvento;
    private int numeroBigliettiVenduti;
    private int numeroBigliettiResidui;
    private double prezzo;
    
    /**
     * Il metodo costruttore Evento istanzia un oggetto di tipo evento nel main
     * @param nomeEvento
     * @param numeroBigliettiVenduti
     * @param numeroBigliettiResidui
     * @param prezzo 
     */
    public Evento(String nomeEvento, int numeroBigliettiVenduti, int numeroBigliettiResidui, double prezzo)
    {
        this.nomeEvento = nomeEvento;
        this.numeroBigliettiVenduti = numeroBigliettiVenduti;
        this.numeroBigliettiResidui = numeroBigliettiResidui;
        this.prezzo = prezzo;
    }
    
    /**
     * Il metodo getNomeEvento visualizza il nome dell'evento sul main
     * @return this.nomeEvento 
     */
    public String getNomeEvento()
    {
        return this.nomeEvento;
    }
    
    /**
     * Il metodo getNumeroBigliettiVenduti visualizza il numero dei bilgietti venduti sul main
     * @return this.numeroBigliettiVenduti
     */
    public int getNumeroBigliettiVenduti()
    {
        return this.numeroBigliettiVenduti;
    }
    
    /**
     * Il metodo getNumeroBigliettiResidui visualizza il numero dei biglietti residui sul main
     * @return this.numeroBigliettiResidui
     */
    public int getNumeroBigliettiResidui()
    {
        return this.numeroBigliettiResidui;
    }
    
    /**
     * Il metodo getPrezzo visualizza il prezzo sul main
     * @return this.prezzo 
     */
    public double getPrezzo()
    {
        return this.prezzo;
    }
    
    /**
     * Il metodo setNomeEvento modifica il titolo dell'evento sul main
     * @param nomeEvento
     * @return this.nomeEvento
     */
    public String setNomeEvento(String nomeEvento)
    {
        this.nomeEvento = nomeEvento;
        return this.nomeEvento;
    }
    
    /**
     * Il metodo setPrezzo modifica il prezzo sul main
     * @param prezzo
     * @return this.prezzo 
     */
    public double setPrezzo(double prezzo)
    {
        this.prezzo = prezzo;
        return this.prezzo;
    }
    
    /**
     * Il metodo vendiBiglietti vende i biglietti dell'evento
     * @param numeroBiglietti
     * @return 
     */
    public boolean vendiBiglietti(int numeroBiglietti)
    {
        if (this.numeroBigliettiResidui > numeroBiglietti)
        {
            this.numeroBigliettiResidui = this.numeroBigliettiResidui - numeroBiglietti;
            this.numeroBigliettiVenduti = this.numeroBigliettiVenduti + numeroBiglietti;
            return true;
        }
        return false;
    }
    
    /**
     * Il metodo ristampaBiglietti aggiunge biglietti vendibili dell'evento
     * @param numeroBiglietti
     * @return this.numeroBigliettiResidui
     */
    public int ristampaBiglietti(int numeroBiglietti)
    {
        this.numeroBigliettiResidui = this.numeroBigliettiResidui + numeroBiglietti;
        return this.numeroBigliettiResidui;
    }
    
    /**
     * Il metodo toString riporta le informazioni riguardanti l'evento sul main
     * @return
     */
    public String toString()
    {
        return "L'evento " + this.nomeEvento + " ha un numero di biglietti pari a " + this.numeroBigliettiResidui + " con il prezzo di " + this.prezzo + " euro ciascuno e ne sono stati venduti " + this.numeroBigliettiVenduti + ".";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nomeEvento);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.prezzo) ^ (Double.doubleToLongBits(this.prezzo) >>> 32));
        return hash;
    }

    /**
     * Il metodo equals confronta due eventi per vedere se sono uguali
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        return Objects.equals(this.nomeEvento, other.nomeEvento);
    } 
}
