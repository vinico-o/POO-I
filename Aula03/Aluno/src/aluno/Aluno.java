/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author Vinícius Mardegan
 */
public class Aluno {
    private String ra;
    private String nome;
    private float p1;
    private float p2;
    private float t1;
    private float t2;
    
    public Aluno (String ra, String nome, float p1, float p2, float t1, float t2){
        this.ra = ra;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public float CalcularMedia() {
        return (p1 + p2 + t1 + t2) / 4.0f;
    }
    
    public boolean Aprovado() {
        if(CalcularMedia() >= 5) {
            return true;
        }
        return false;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public float getT1() {
        return t1;
    }

    public float getT2() {
        return t2;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return "\nAluno\n" + "ra: " + ra + "\nnome: " + nome + "\np1: " + p1 + "\np2: " + p2 + "\nt1: " + t1 + "\nt2: " + t2;
    }
    
    
    
}
