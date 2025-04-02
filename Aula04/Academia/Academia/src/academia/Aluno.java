/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academia;
import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Aluno {
    private String nome;
    private String RA;
    private int idade;
    private float peso;
    private float altura;
    
    public Aluno(String nome, String RA, int idade, float peso, float altura) {
        this.nome = nome;
        this.RA = RA;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public float CalcularIMC()
    {
        return (peso / (altura * altura));
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\nRA: " + RA + "\nidade: " + idade + "\npeso: " + peso + "\naltura: " + altura + "\n";
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
