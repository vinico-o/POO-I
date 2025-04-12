/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peca;

/**
 *
 * @author Vinícius Mardegan
 */
public class PecaImportada extends Peca{
    private float taxaImportacao;
    private float frete;
    
    public PecaImportada() {
        
    }
    
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float frete) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
        this.taxaImportacao = taxaImportacao;
        this.frete = frete;
    }
    
    float CalcularPreco() {
        return custo + lucro + taxaImportacao + frete;
    }
    
    void ExibirPeca() {
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("taxaImportacao: " + taxaImportacao);
        System.out.println("Frete: " + frete);
        System.out.println("Preco: " + CalcularPreco());
        System.out.println("");
    }
    
}
