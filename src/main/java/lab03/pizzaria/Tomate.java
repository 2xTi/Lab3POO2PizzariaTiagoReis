/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.pizzaria;

/**
 *
 * @author palit
 */
public class Tomate extends Decorator {
    
    public Tomate(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double custo() {
        return pizza.custo() + 2.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com tomate";
    }
    
}
