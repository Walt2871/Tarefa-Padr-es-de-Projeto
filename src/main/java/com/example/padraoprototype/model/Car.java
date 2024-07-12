package com.example.padraoprototype.model;

public class Car implements CarPrototype {
    private String modelo;
    private String cor;
    private String motor;
    public Car(String model, String color, String engineType) {
        this.modelo = model;
        this.cor = color;
        this.motor = engineType;
    }
    @Override
    public CarPrototype clone() {
        return new Car(this.modelo, this.cor, this.motor);
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Car [modelo=" + modelo + ", cor=" + cor + ", motor=" + motor + "]";
    }
}
