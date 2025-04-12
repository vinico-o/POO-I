/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

/**
 *
 * @author Vinícius Mardegan
 */
public class Nacional extends Produto{
    private float taxa = 0.05f;
    
    public void Exibir() {
        System.out.println("DESCRICAO: " + descricao);
        System.out.println("VALOR: " + valor);
        System.out.println("IMPOSTO: " + imposto);
        System.out.println("TAXA: " + taxa);
        System.out.println("VALOR FINAL: " + ValorFinal());
        System.out.println("");
    }
    
    public Nacional() {
        
    }
    
    public Nacional(String descricao, float valor) {
        super(descricao, valor);
    }
    
    public float ValorFinal() {
        return (valor + (valor * imposto) + (valor * taxa));
    }
    
    public float getTaxa() {
        return taxa;
    }
    
}
