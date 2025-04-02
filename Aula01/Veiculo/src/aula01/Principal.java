/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setAno(1967);
        v1.setMarca("Chevrolet");
        v1.setModelo("Opala");
        v1.emprestar();
        
        System.out.println(v1.getMarca());
        System.out.println(v1.getModelo());
        System.out.println(v1.getAno());
        if(v1.estaDisponivel()){
            System.out.println("Esta Disponivel");
        } else {
            System.out.println("Nao Disponivel");
        }
        v1.devolver();
        if(v1.estaDisponivel()){
            System.out.println("Esta Disponivel");
        } else {
            System.out.println("Nao Disponivel");
        }
    }
}
