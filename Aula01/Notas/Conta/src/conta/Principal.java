/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.setNome("Vinicius");
        c1.setNumero("0001");
        c1.setSaldo(0.0);
        
        c1.Sacar(10.0);
        c1.Depositar(10000);
        c1.Sacar(100);
    }
}
