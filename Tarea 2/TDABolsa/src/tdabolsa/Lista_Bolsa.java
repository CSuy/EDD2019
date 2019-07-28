/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdabolsa;

import javax.swing.JOptionPane;

/**
 *
 * @author MiriamLeticia
 */
public class Lista_Bolsa {
    public static Nodo_Bolsa inicio;
    private int tam=0;

    public Lista_Bolsa() {
    }
    
    public void ingresar(int x, int y){
        Nodo_Bolsa elemento = new Nodo_Bolsa(x,y);
        Nodo_Bolsa nuevo = new Nodo_Bolsa();
        if(inicio==null){
            inicio=elemento;
            inicio.setSiguiente(inicio);
            tam++;
        }else{
            Nodo_Bolsa aux=inicio;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                if(aux.getSiguiente()==inicio){
                    aux.setSiguiente(null);
                }
            }
            aux.setSiguiente(elemento);
            elemento.setSiguiente(inicio);
            tam++;
        }
        
    }
    
    public boolean vacia(){
        boolean prueba=false;
        if(inicio==null){
            prueba=true;
        }
        return prueba;
    }
    
    public void mostrar(){
        Nodo_Bolsa aux=inicio;
        int contador=1;
        while(aux.getSiguiente()!=null && contador<=tam){
            System.out.println("En X: " + aux.getX()+" En Y: "+ aux.getY());
            aux= aux.getSiguiente();
            contador++;
        }
    }
    
    public String mostrar1(){
        String cadena ="";
        Nodo_Bolsa aux=inicio;
        int contador=1;
        while(aux.getSiguiente()!=null && contador<=tam){
            cadena=cadena+"En X: " + aux.getX() + " En Y: "+aux.getY()+"\n";
            aux= aux.getSiguiente();
            contador++;
        }
        return cadena;
    }
    
    public int contar(int cnt){
        int resultado=tam;
        if(cnt<=resultado && cnt>=0){
            resultado=resultado-cnt;
        }else if(cnt<0){
            JOptionPane.showMessageDialog(null,"No ingresar numero negativos");
        }else{
            JOptionPane.showMessageDialog(null,"El numero sobre pasa a la cantidad de elementos");
//            System.out.println("El numero sobre pasa a la cantidad de elementos ");
        }
        return resultado;
    }

    public Nodo_Bolsa getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_Bolsa inicio) {
        this.inicio = inicio;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    
}
