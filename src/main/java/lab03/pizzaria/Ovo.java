/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.pizzaria;

/**
 *
 * @author palit
 */
public class Ovo extends Decorator {
    
    public Ovo(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double custo() {
        return pizza.custo() + 1.50;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com ovo";
    }
    
}