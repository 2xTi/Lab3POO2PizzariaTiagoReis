/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.pizzaria;

/**
 *
 * @author palit
 */
public class Decorator implements Pizza {
    
    Pizza pizza;
    
    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double custo() {
        return pizza.custo();
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
    
}