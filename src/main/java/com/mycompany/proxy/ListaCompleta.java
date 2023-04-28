/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author João Vitor
 */
public class ListaCompleta implements ListaContato {
    private String lista;
    
    public ListaCompleta(String lista){
        this.lista = lista;
    }       
@Override
public void mostrar (){
        System.out.println("Visualizando lista telefônica... ");
}
public void imprimirListaCompleta(String lista){
    System.out.println("Imprimindo lista telefônica... ");
}
}


