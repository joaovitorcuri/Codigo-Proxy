/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proxy;

/**
 *
 * @author João Vitor
 */
public class Proxy {

    public static void main(String[] args) {
        ListaContato lista = new ProxyListaContato ("de Araguari - MG");
       
        System.out.println("");
        lista.mostrar();
    }
}
