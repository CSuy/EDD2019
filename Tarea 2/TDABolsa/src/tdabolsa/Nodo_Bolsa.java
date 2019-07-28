/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdabolsa;

/**
 *
 * @author MiriamLeticia
 */
public class Nodo_Bolsa {
    private Nodo_Bolsa siguiente;
    private Nodo_Bolsa Anterior;
    private int x;
    private int y;

    public Nodo_Bolsa() {
    }

    public Nodo_Bolsa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Nodo_Bolsa getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_Bolsa Anterior) {
        this.Anterior = Anterior;
    }
    
        
    public Nodo_Bolsa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Bolsa siguiente) {
        this.siguiente = siguiente;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
