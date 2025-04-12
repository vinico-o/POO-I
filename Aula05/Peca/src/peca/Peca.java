/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peca;

/**
 *
 * @author Vinícius Mardegan
 */
public class Peca {
    protected String nome;
    protected float custo;
    protected float lucro;
    
    public Peca() {
        
    }
    
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }
    
    float CalcularPreco() {
        return custo + lucro;
    }

    void ExibirPeca() {
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Preco: " + CalcularPreco());
        System.out.println("");
    }
    
    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }
    
}
