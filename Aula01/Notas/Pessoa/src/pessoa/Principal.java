/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Vinicius");
        p1.setIdade(18);
        p1.setAltura(1.78f);
        p1.setPeso(76f);
        
        if(p1.isMenor()){
            System.out.println("Eh Maior");
        }
        else {
            System.out.println("Nao eh Maior");
        }
        
        System.out.println("IMC: "+p1.calcularIMC());
    }
}
