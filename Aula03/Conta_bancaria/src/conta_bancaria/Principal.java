/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_bancaria;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Conta conta;
        conta = new Conta("0100", "Vinicius", 90.0f);
        
        System.out.println(conta);
        conta.Depositar(10.0f);
        System.out.println(conta);
        conta.Sacar(10.0f);
        System.out.println(conta);
        conta.Sacar(100.0f);
        System.out.println(conta);
        conta.Sacar(10.0f);
        System.out.println(conta);
    }
}
