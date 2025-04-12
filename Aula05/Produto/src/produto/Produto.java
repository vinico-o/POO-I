/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produto;

/**
 *
 * @author Vinícius Mardegan
 */
public class Produto {
    protected String descricao;
    protected float valor;
    protected float imposto = 0.1f;
    
    public Produto() {
    
    }
    
    public Produto(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public float ValorFinal() {
        return (valor + (valor * imposto));
    }
    
    public void Exibir() {
        System.out.println("DESCRICAO: " + descricao);
        System.out.println("VALOR: " + valor);
        System.out.println("IMPOSTO: " + imposto);
        System.out.println("VALOR FINAL: " + ValorFinal());
        System.out.println("");
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
