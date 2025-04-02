/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Aluno al1;
        al1 = new Aluno();
        
        al1.setNome("Vinicius");
        al1.setRA("1234");
        al1.setP1(9.0f);
        al1.setP2(9.5f);
        al1.setT1(10);
        al1.setT2(9.0f);
        System.out.println("Media: "+ al1.calcularMedia());
        if(al1.Aprovado()){
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
        }
        
    }
}
