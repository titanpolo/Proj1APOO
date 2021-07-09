/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author terat
 */
public class Motor {
    //Atributos
    protected Double velocidade;
    protected final String fabricante;
    protected final String tensao;
    protected Boolean status;

    //Construtor
    public Motor(String fabricante, String tensao) {
        this.velocidade = 0.0;
        this.fabricante = fabricante;
        this.tensao = tensao;
        this.status = false;
    }

    //Getters e Setters

    public Double getVelocidade() {
        return velocidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getTensao() {
        return tensao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    
    //Funcionalidades
    public void liga(){
        if(getStatus()){
            return;
        }
        else this.setStatus(true);
    }
    
    public void desliga(){
        if(getStatus()){
            this.setStatus(false);
        }
        else return;
    }

    public Double verificaVelocidade(){
        return getVelocidade();
    }
}