/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Aluno aluno;
        aluno = new Aluno("Vinicius", 18, 75.5f, 1.78f);
        
        System.out.println(aluno);
        System.out.println("IMC: " + aluno.CalcularIMC());
        System.out.println("Menor de Idade: " + aluno.MenorIdade());
    }
}
