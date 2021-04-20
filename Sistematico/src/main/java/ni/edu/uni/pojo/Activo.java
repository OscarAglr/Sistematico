/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.pojo;

/**
 *
 * @author Sistemas-15
 */
public class Activo {
    private float valor_bien;
    private float valor_residual;
    private String tipo;

    public Activo(float valor_bien, float valor_residual, String tipo) {
        this.valor_bien = valor_bien;
        this.valor_residual = valor_residual;
        this.tipo = tipo;
    }

    public float getValor_bien() {
        return valor_bien;
    }

    public void setValor_bien(float valor_bien) {
        this.valor_bien = valor_bien;
    }

    public float getValor_residual() {
        return valor_residual;
    }

    public void setValor_residual(float valor_residual) {
        this.valor_residual = valor_residual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
