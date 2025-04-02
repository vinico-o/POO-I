/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta_corrente;

/**
 *
 * @author Vinícius Mardegan
 */
public class Conta_Corrente {
    private String numero;
    private String titular;
    private float saldo;
    private float limite;
    
    public Conta_Corrente() {
        
    }
    
    public Conta_Corrente(String numero, String titular, float saldo, float limite) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
            this.limite = limite;
    }
    
    public void Depositar(float valor)
    {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    
    public void Sacar(float valor)
    {
        if((saldo + limite) >= valor)
        {
            saldo -= valor;
        }
        else
        {
            System.out.println("Impossivel Realizar a Operacao!");
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\nCONTA_CORRENTE\n" + "Numero: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo + "\nLimite: " + limite;
    }
    
    
    
}
