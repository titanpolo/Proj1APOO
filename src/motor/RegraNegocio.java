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
public class RegraNegocio {
    protected static int controle;
    protected static Double escala;
    protected static Double velocidadeMax;
    protected static Double velocidadeMin;

    public RegraNegocio(Double escala, Double velocidadeMax, Double velocidadeMin) {
        this.escala=escala;
        this.controle=0;
        this.velocidadeMax=velocidadeMax;
        this.velocidadeMin=velocidadeMin;
    }

    public static int getControle() {
        return controle;
    }

    public static void setControle(int controle) {
        RegraNegocio.controle = controle;
    }

    public static Double getEscala() {
        return escala;
    }

    public static void setEscala(Double escala) {
        RegraNegocio.escala = escala;
    }

    public static Double getVelocidadeMax() {
        return velocidadeMax;
    }

    public static void setVelocidadeMax(Double velocidadeMax) {
        RegraNegocio.velocidadeMax = velocidadeMax;
    }

    public static Double getVelocidadeMin() {
        return velocidadeMin;
    }

    public static void setVelocidadeMin(Double velocidadeMin) {
        RegraNegocio.velocidadeMin = velocidadeMin;
    }
    
    
    
}
