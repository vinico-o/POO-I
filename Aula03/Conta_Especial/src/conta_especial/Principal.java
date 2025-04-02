/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_especial;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Conta_Especial conta1 = new Conta_Especial("0100", "Vinicius", 1000.0f, 500.0f);
        
        //estado inicial da conta
        System.out.println(conta1);

        //deposito (sem restricao)
        conta1.Depositar(300.0f);
        System.out.println(conta1);
        
        //saque dentro do limite
        conta1.Sacar(400.0f);
        System.out.println(conta1);
        
        //saque dentro do limite e acima do saldo
        conta1.Sacar(1000.0f);
        System.out.println(conta1);
        
        //saque fora do limite
        conta1.Sacar(2000.0f);
        System.out.println(conta1);
        
    }
}
