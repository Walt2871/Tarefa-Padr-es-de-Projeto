package com.example.padraoprototype;

import com.example.padraoprototype.model.Car;

public class CarClient {
    public static void main(String[] args) {
        Car carro = new Car("Sedan", "Preto", "V6");

        Car clone1 = (Car) carro.clone();
        clone1.setCor("Azul");

        Car clone2 = (Car) carro.clone();
        clone2.setMotor("Eletrico");

        System.out.println("Carro: " + carro);
        System.out.println("Carro clonado 1: " + clone1);
        System.out.println("Carro clonado 2: " + clone2);
    }
}

