/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.ejerciciot1;

//2.
public class Main {
    public static void main(String[] args) {
       
       //2.1
        Thread hiloPrincipal = Thread.currentThread();

        //2.2
        System.out.println("Nombre del hilo principal: " + hiloPrincipal.getName());

        // 2.3
        hiloPrincipal.setName("HiloPrincipalModificado");
        System.out.println("Nuevo nombre del hilo principal: " + hiloPrincipal.getName());

        // 2.4
        System.out.println("Prioridad del hilo principal: " + hiloPrincipal.getPriority());

        // 2.5
        hiloPrincipal.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Nueva prioridad del hilo principal: " + hiloPrincipal.getPriority());
    }
}

