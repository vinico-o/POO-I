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
public class Sistema {
    int numAlunos = 0;
    int tamanho = 100;
    Aluno alunos[] = new Aluno[tamanho];
    
    private int Menu()
    {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Relatorio Geral");
        System.out.println("9 - Sair");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public void ExecutarSistema()
    {
        String nome, RA;
        int idade;
        float peso, altura;
        Scanner sc = new Scanner(System.in);
        int op;
        
        do {
            op = Menu();
            switch(op)
            {
                case 1:
                    if(numAlunos < tamanho)
                    {
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        System.out.print("RA: ");
                        RA = sc.nextLine();
                        System.out.print("Idade: ");
                        idade = Integer.parseInt(sc.nextLine());
                        System.out.print("Peso: ");
                        peso = Float.parseFloat(sc.nextLine());
                        System.out.print("Altura: ");
                        altura = Float.parseFloat(sc.nextLine());
                        
                        alunos[numAlunos] = new Aluno(nome, RA, idade, peso, altura);
                        numAlunos++;
                    }
                    break;
                
                case 2:
                    for(int i = 0; i < numAlunos; i++)
                    {
                        System.out.println("Nome aluno " + i + ":" + alunos[i].getNome());
                    }
                    break;
                
                case 3:
                    for(int i = 0; i < numAlunos; i++)
                    {
                        System.out.println(alunos[i]);
                    }
                    break;
        
            }
            
        }while (op != 9);
    }
    
}
