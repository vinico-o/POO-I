/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_corrente;

/**
 *
 * @author Vinícius Mardegan
 */
public class Teste {
    
    public static void main(String[] args) {
        Conta_Corrente contas[] = new Conta_Corrente[3];
    
        contas[0] = new Conta_Corrente();
        contas[1] = new Conta_Corrente("0100", "Vinicius", 300.0f, 200.0f);
        contas[2] = new Conta_Corrente("0200", "Mardegan", 200.0f, 100.0f);
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(contas[i]);
        }
    }
    
}
