package Core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fjeronimo
 */
public class Dog {
    private String name;
    private String raza;
    private int edad;

    public Dog(String name, String raza, int edad) {
        this.name = name;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
    
}
