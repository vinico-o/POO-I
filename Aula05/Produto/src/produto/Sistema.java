/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Sistema {
    int MAX = 9;
    int cont;
    Scanner sc = new Scanner(System.in);
    
    Produto produto[] = new Produto[MAX];
    
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
        if(cont < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produto[cont] = new Estadual(descricao, valor);
            cont++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
        
    }
    
    private void CadastrarNacional ()
    {
        if(cont < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produto[cont] = new Nacional(descricao, valor);
            cont++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
        
    }
    
    private void CadastrarImportado ()
    {
        if(cont < MAX)
        {
            String descricao;
            float valor;
            
            System.out.print("Descricao: ");
            descricao = sc.nextLine();
            System.out.print("Valor: ");
            valor = Float.parseFloat(sc.nextLine());
            
            produto[cont] = new Importado(descricao, valor);
            cont++;
        }
        else
        {
            System.out.println("Maximo de itens alcançado!");
            return;
        }
        
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
                    for(int i = 0; i < cont; i++) {
                        if(produto[i].getClass().equals(Estadual.class)) {
                            produto[i].Exibir();
                        }
                    }
                    break;
                case 5:
                    for(int i = 0; i < cont; i++) {
                        if(produto[i].getClass().equals(Nacional.class)) {
                            produto[i].Exibir();
                        }
                    }
                    break;
                case 6:
                    for(int i = 0; i < cont; i++) {
                        if(produto[i].getClass().equals(Importado.class)) {
                            produto[i].Exibir();
                        }
                    }
                    break;
                case 7:
                    for(int i = 0; i < cont; i++) {
                        produto[i].Exibir();
                    }
                    break;
            }
        } while(op != 9);
    }
}