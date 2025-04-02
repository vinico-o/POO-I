/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

/**
 *
 * @author Vinícius Mardegan
 */
public class Conta {

    private String nome;
    private String numero;
    private double saldo;
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setNumero(String numero){
        this.numero = numero;
    }
    
    void setSaldo (double saldo){
        this.saldo = saldo;
    }
    
    public void Depositar(double numero){
        System.out.println("Saldo antes da movimentacao: " + saldo);
        saldo = saldo + numero;
        System.out.println("Saldo depois da movimentacao: " + saldo);
    }
    
    public void Sacar (double numero){
        if(saldo >= numero && saldo > 0){
            System.out.println("Saldo antes da movimentacao: " + saldo);
            saldo = saldo - numero;
            System.out.println("Saldo depois da movimentacao: " + saldo);
        }
        else {
            System.out.println("Impossivel realizar movimentacao!");
        }
    }
    
}
