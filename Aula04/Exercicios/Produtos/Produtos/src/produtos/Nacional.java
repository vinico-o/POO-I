/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author Vinícius Mardegan
 */
public class Nacional {
    private String descricao;
    private float valor;
    private float imposto = 0.1f;
    private float taxa = 0.05f;
    
    public Nacional(String descricao, float valor) {
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
        return valor + valor * imposto + valor * taxa;
    }

    public float getImposto() {
        return imposto;
    }

    public float getTaxa() {
        return taxa;
    }
    
    @Override
    public String toString() {
        return "\nPRODUTO\nDescricao: " + descricao + "\nValor: " + valor + "\nImposto: " + "\nValor FInal: " + getValorFinal() + imposto + "\nTaxa: " + taxa;
    }
      
}
