/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;
import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Teste {
    public static void main(String[] args) {
        Aluno vetor[] = new Aluno[5];
        
        vetor[0] = new Aluno("aluno 1", "0100", 18, 57.6f, 1.65f);
        vetor[1] = new Aluno("aluno 2", "0200", 22, 75.0f, 1.70f);
        vetor[2] = new Aluno("aluno 3", "0300", 25, 90.5f, 2.05f);
        vetor[3] = new Aluno("aluno 4", "0400", 30, 80.0f, 1.85f);
        vetor[4] = new Aluno("aluno 5", "0500", 40, 70.f, 1.70f);
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println(vetor[i]);
        }
    }
}
