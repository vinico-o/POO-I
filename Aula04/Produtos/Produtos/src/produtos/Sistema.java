/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Sistema {
    int numEstadual = 0, numNacional = 0, numImportado = 0;
    int MAX = 3;
    Scanner sc = new Scanner(System.in);
    
    Estadual produtoEstadual[] = new Estadual[MAX];
    Nacional produtoNacional[] = new Nacional[MAX];
    Importado produtoImportado[] = new Importado[MAX];
    
    private int Menu()
    {
        int op;
        System.out.println("\nMENU");
        System.out.println("1 - Cadastrar Produto Estadual");
        System.out.println("2 - Cadastrar Produto Nacional");
        System.out.println("3 - Cadastrar Produto Importado");
        System.out.println("4 - Exibir Produtos Estaduais");
        System.out.println("5 - Exibir Produtos Nacionais");
        System.out.println("6 - Exibir Produtos Importados");
        System.out.println("7 - Exibir Todos Produtos");
        System.out.println("9 - SAIR");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    private void CadastrarEstadual ()
    {
        if(numEstadual < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produtoEstadual[numEstadual] = new Estadual(descricao, valor);
            numEstadual++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
            
    }
    
    private void CadastrarNacional ()
    {
        if(numNacional < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produtoNacional[numNacional] = new Nacional(descricao, valor);
            numNacional++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
            
    }
    
    void CadastrarImportado ()
    {
        if(numImportado < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produtoImportado[numImportado] = new Importado(descricao, valor);
            numImportado++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
            
    }
    
    private void ExibirEstadual()
    {
        if(numEstadual != 0)
        {
            for(int i = 0; i < numEstadual; i++)
            {
                System.out.println(produtoEstadual[i]);
            }
        }
        else
        {
            System.out.println("Nao ha produtos Estaduais");
        }
        
    }
    
    private void ExibirNacional()
    {
        if(numNacional != 0)
        {
            for(int i = 0; i < numNacional; i++)
            {
                System.out.println(produtoNacional[i]);
            }
        }
        else
        {
            System.out.println("Nao ha produtos Nacionais");
        }
        
    }
    
    private void ExibirImportado()
    {
        if(numImportado != 0)
        {
            for(int i = 0; i < numImportado; i++)
            {
                System.out.println(produtoImportado[i]);
            }
        }
        else
        {
            System.out.println("Nao ha produtos Importados");
        }
    }
    
    private void ExibirTodos()
    {
        ExibirEstadual();
        ExibirNacional();
        ExibirImportado();
    }
    
    public void ExecutarSistema()
    {
        int op;
        do
        {
            op = Menu();
            switch(op)
            {
                case 1:
                    CadastrarEstadual();
                    break;
                case 2:
                    CadastrarNacional();
                    break;
                case 3:
                    CadastrarImportado();
                    break;    
                case 4:
                    ExibirEstadual();
                    break;
                case 5:
                    ExibirNacional();
                    break;
                case 6:
                    ExibirImportado();
                    break;
                case 7:
                    ExibirTodos();
                    break;
            }
        } while(op != 9);
    }
}
