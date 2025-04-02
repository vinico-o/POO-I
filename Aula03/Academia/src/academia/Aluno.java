/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academia;

/**
 *
 * @author Vinícius Mardegan
 */
public class Aluno {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public Aluno (String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public boolean MenorIdade() {
        if(idade < 18) {
            return true;
        }
        return false;
    }
    
    public float CalcularIMC() {
        return (peso / (altura * altura));
    }

    public String getNome() {
        return nome;
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "\nAluno\n" + "Nome: " + nome + "\nPeso: " + peso + "\nAltura: " + altura + "\nIdade: " + idade;
    }
    
}
