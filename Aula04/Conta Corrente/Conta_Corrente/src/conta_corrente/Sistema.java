/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_corrente;
import java.util.Scanner;

/**
 *
 * @author Vinícius Mardegan
 */
public class Sistema {
    int num_conta = 0;
    int MAX = 3;
    Conta_Corrente contas[] = new Conta_Corrente[MAX];
    
    private int Menu()
    {
        int escolha;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMENU");
        System.out.println("1 - Cadastrar Conta");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("4 - Listar Contas");
        System.out.println("5 - Relatorio Geral");
        System.out.println("6 - Contas Negativadas");
        System.out.println("7 - Buscar Conta");
        System.out.println("9 - Sair");
        escolha = Integer.parseInt(sc.nextLine());
        return escolha;
    }
    
    private void Cadastrar()
    {
        String numero, titular;
        float saldo, limite;
        Scanner sc = new Scanner(System.in);
        
        if(num_conta <= MAX)
        {
            System.out.println("Cadastro Iniciado!\n");
            System.out.println("Numero: ");
            numero = sc.nextLine();
            System.out.println("Titular: ");
            titular = sc.nextLine();
            System.out.println("Saldo: ");
            saldo = Float.parseFloat(sc.nextLine());
            System.out.println("Limite: ");
            limite = Float.parseFloat(sc.nextLine());
        }
        else
        {
            System.out.println("Numero maximo de contas!");
            return;
        }
        contas[num_conta] = new Conta_Corrente(numero, titular, saldo, limite);
        num_conta++;
    }
    
    private void ListarContas()
    {
        for(int j = 0; j < num_conta; j++)
        {
            System.out.println("Titular: " + contas[j].getTitular());
            System.out.println("Posicao: " + j);
        }
    }
    
    private void RelatorioGeral()
    {
        for(int j = 0; j < num_conta; j++)
        {
            System.out.println("RELATORIO GERAL");
            System.out.println(contas[j]);
        }
    }
    
    private void RelatorioNegativadas()
    {
        for(int j = 0; j < num_conta; j++)
        {
            System.out.println("RELATORIO DE NEGATIVADAS");
            if(contas[j].getSaldo() < 0)
            {
                System.out.println(contas[j]);
            }
        }
    }
    
    private void BuscarTitular()
    {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do titular: ");
        nome = sc.nextLine();
        
        for(int j = 0; j < num_conta; j++)
        {
            if(contas[j].getTitular().equals(nome))
            {
                System.out.println("CONTA BUSCADA: ");
                System.out.println(contas[j]);
                return;
            }
        }
        
        System.out.println("Aluno nao encontrado!");
    }
    
    public void Executar()
    {
        int escolha, i;
        float valor;
        Scanner sc = new Scanner(System.in);
     
        do{
            escolha = Menu();
            switch(escolha)
            {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = Float.parseFloat(sc.nextLine());
                    System.out.println("Digite a posicao da conta: ");
                    i = Integer.parseInt(sc.nextLine());
                    contas[i].Sacar(valor);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = Float.parseFloat(sc.nextLine());
                    System.out.println("Digite a posicao da conta: ");
                    i = Integer.parseInt(sc.nextLine());
                    contas[i].Depositar(valor);
                    break;
                case 4:
                    ListarContas();
                    break;
                case 5:
                    RelatorioGeral();
                    break;
                case 6:
                    RelatorioNegativadas();
                    break;
                case 7:
                    BuscarTitular();
                    break;
            }
        }while(escolha != 9);
    }
    
}
