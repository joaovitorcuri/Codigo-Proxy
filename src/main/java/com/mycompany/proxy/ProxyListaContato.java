/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author João Vitor
 */
public class ProxyListaContato implements ListaContato {
    private ListaCompleta listaCompleta;
    private String lista;
    
    public ProxyListaContato(String lista){
        this.lista = lista;
    }
@Override
public void mostrar(){
    if (listaCompleta == null){
        listaCompleta = new ListaCompleta (lista);
    }
listaCompleta.mostrar();
    
}



}
