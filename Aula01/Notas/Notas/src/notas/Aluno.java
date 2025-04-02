/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

/**
 *
 * @author Vinícius Mardegan
 */
public class Aluno {
    
    private String nome;
    private String RA;
    private float t1;
    private float t2;
    private float p1;
    private float p2;
    private boolean Aprovado;
    
    void setNome(String Nome){
        this.nome = nome;
    }
    
    void setRA(String RA){
        this.RA = RA;
    }
    
    void setT1(float t1){
        this.t1 = t1;
    }
    
    void setT2(float t2){
        this.t2 = t2;
    }
    
    void setP1(float p1){
        this.p1 = p1;
    }
    
    void setP2(float p2){
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public float getT1() {
        return t1;
    }

    public float getT2() {
        return t2;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    public float calcularMedia(){
        return (t1 + t2 + p1 + p2) / 4.0f;
    }
    
    public boolean Aprovado(){
        if(calcularMedia() >= 5.0f){
            return true;
        } else {
            return false;
        }
    }
}
