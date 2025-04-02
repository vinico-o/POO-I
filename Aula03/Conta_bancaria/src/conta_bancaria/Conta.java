/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta_bancaria;

/**
 *
 * @author Vinícius Mardegan
 */
public class Conta {
    private String numero;
    private String nome;
    private float saldo;
    
    public Conta(String numero, String nome, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void Depositar(float valor) {
        saldo = saldo + valor;
    }
    
    public void Sacar(float valor) {
        if(saldo >= 0) {
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo Negativo! Impossivel Sacar");
        }
    }
    
    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
}
