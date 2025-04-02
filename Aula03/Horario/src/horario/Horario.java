/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horario;

/**
 *
 * @author Vinícius Mardegan
 */
public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Horario() {
        
    }
    
    public Horario(int hora, int minuto, int segundo) {
        if(hora >= 24) {
            System.out.println("Horas acima do limite!");
        }
        else {
            this.hora = hora;
        }
        
        if(minuto >= 60) {
            System.out.println("Minutos acima do limite!");
        }
        else {
            this.minuto = minuto;
        }
        
        if(segundo > 24) {
            System.out.println("Segundos acima do limite!");
        }
        else {
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if(hora >= 24) {
            System.out.println("Horas acima do limite!");
        }
        else {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if(minuto >= 60) {
            System.out.println("Minutos acima do limite!");
        }
        else {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if(segundo > 24) {
            System.out.println("Segundos acima do limite!");
        }
        else {
            this.segundo = segundo;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
    
}
