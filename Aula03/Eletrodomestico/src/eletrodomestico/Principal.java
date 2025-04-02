/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletrodomestico;

import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Eletrodomestico eletrodomestico;
        eletrodomestico = new Eletrodomestico("telefone", 3.0f, 24.0f);
        Scanner sc = new Scanner(System.in);
        
        System.out.println(eletrodomestico);
        System.out.print("Preco do Kwatt: ");
        System.out.println("Gasto Mensal: " + eletrodomestico.Gastomensal(Float.parseFloat(sc.nextLine())));
    }
}
