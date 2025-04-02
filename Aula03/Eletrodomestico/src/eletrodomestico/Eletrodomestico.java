/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eletrodomestico;

/**
 *
 * @author Vinícius Mardegan
 */
public class Eletrodomestico {
    private String nome;
    private float potencia;
    private float tempo;
    
    public float UsoDiario() {
        return (potencia * tempo);
    }
    
    public float UsoMensal() {
        return (UsoDiario() * 30);
    }
    
    public float UsoAnual() {
        return (UsoMensal() * 12);
    }
    
    public float Gastomensal(float valor) {
        return (UsoMensal() / 1000) * valor;
    }
    
    public Eletrodomestico()
    {
        
    }
    
    public Eletrodomestico(String nome, float potencia, float tempo)
    {
        this.nome = nome;
        this.potencia = potencia;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public float getPotencia() {
        return potencia;
    }

    public float getTempo() {
        return tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "\nEletrodomestico\n" + "Nome: " + nome + "\npotencia: " + potencia + 'W' + "\nTempo: " + tempo + 
                "\nUso Diario: " + UsoDiario() + 'W' + "\nUso Mensal: " + UsoMensal() + 'W' + "\nUso Anual: " + UsoAnual() + 'W';
    }
    
}
