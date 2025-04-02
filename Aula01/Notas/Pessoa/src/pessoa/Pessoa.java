/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author Vinícius Mardegan
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    void setPeso(float peso){
        this.peso = peso;
    }
    
    void setAltura(float altura){
        this.altura = altura;
    }
    
    public boolean isMenor(){
        if(idade >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    
    public float calcularIMC(){
        return (peso / (altura * altura));
    }
}
