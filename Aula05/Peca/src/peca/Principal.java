/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peca;

/**
 *
 * @author Vinícius Mardegan
 */
public class Principal {
    public static void main(String[] args) {
        Peca peca = new Peca("rebinboca", 10.f, 20.f);
        PecaImportada pecaImportada = new PecaImportada("parafuseta", 10.f, 20.f, 30.f, 40.f);
        
        peca.ExibirPeca();
        pecaImportada.ExibirPeca();
    }
}
