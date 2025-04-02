/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Aluno aluno;
        aluno = new Aluno("0100", "Vinicius", 10.0f, 9.5f, 10.0f, 9.5f);
        
        System.out.println(aluno);
        System.out.println("media: " + aluno.CalcularMedia());
        System.out.println("aprovado: " + aluno.Aprovado());
    }
}
