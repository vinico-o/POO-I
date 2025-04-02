/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

/**
 *
 * @author Vinícius Mardegan
 */


public class Veiculo {
    private String marca;
    private String modelo;
    private int ano; 
    private boolean disponivel;
    
    void emprestar() {
        disponivel = true;
    }
    void devolver() {
        disponivel = false;
    }
    
    boolean estaDisponivel() {
        return disponivel; //retorna o status da classe
    }
    
    void setAno(int ano){
        this.ano = ano; //o this faz referencia ao atributo da classe
    }
    
    void setMarca(String marca){
        this.marca = marca;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    int getAno(){
        return ano;
    }
    
    String getMarca(){
        return marca;
    }
    
    String getModelo(){
        return modelo;
    }
}
    

