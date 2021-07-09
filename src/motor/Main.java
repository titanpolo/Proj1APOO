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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegraNegocio regra = new RegraNegocio(1000.0, 70000.0, 0.0);//escala de variação de velocidade, velocidade maxima, velocidade minima
        MotorEstendido motor = new MotorEstendido("Renault", "12.5");//fabricante, tensao
        InterfaceGrafica menu = new InterfaceGrafica(motor,regra);//instância da interface gráfica
        menu.renderizarTela();
    }
}