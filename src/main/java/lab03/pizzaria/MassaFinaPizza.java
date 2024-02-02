/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.pizzaria;

/**
 *
 * @author palit
 */
public class MassaFinaPizza implements Pizza {

    @Override
    public double custo() {
        return 70.00;
    }

    @Override
    public String getDescricao() {
        return "Pizza de massa fina";
    }
    
}
