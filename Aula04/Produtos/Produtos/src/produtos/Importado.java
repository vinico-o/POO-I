/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author Vinícius Mardegan
 */
public class Importado {
    private String descricao;
    private float valor;
    private float imposto = 0.1f;
    private float taxa = 0.05f;
    private float taxaImportacao = 0.05f;
    
    public Importado(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public float getValorFinal() {
        return valor + valor * imposto + valor * taxa + valor * taxaImportacao;
    }

    public float getImposto() {
        return imposto;
    }

    public float getTaxa() {
        return taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    @Override
    public String toString() {
        return "\nPRODUTO\nDescricao: " + descricao + "\nValor: " + valor + "\nValor FInal: " + getValorFinal() + "\nImposto: " + imposto + "\nTaxa: " + taxa + "\nTaxa de Importacao: " + taxaImportacao;
    }
    
    
}
