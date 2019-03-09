package com.odinrossy.pismLab3.model;

public class Answer {

    private long id;
    private String username;
    private String brand;
    private String type;
    private short horsepower;
    private short fuelConsumption;
    private short speed;
    private boolean isAutomaticTransmission;
    private boolean isFrontWheel;
    private String color;
    private boolean isSeatHeating;
    private boolean isLeatherInterior;
    private boolean hasNavigator;
    private boolean hasVideoCamera;
    private String wishes;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", Пользователь ='" + username + '\'' +
                ", Марка автомобиля ='" + brand + '\'' +
                ", Тип автомобиля ='" + type + '\'' +
                ", Лошадиные силы =" + horsepower +
                ", Расход топлива на 100 км =" + fuelConsumption +
                ", Максимальная скорость =" + speed +
                ", Трансмиссия =" + (isAutomaticTransmission ? "Автоматическая" : "Ручная") +
                ", isFrontWheel=" + isFrontWheel +
                ", color='" + color +
                ", isSeatHeating=" + isSeatHeating +
                ", isLeatherInterior=" + isLeatherInterior +
                ", hasNavigator=" + hasNavigator +
                ", hasVideoCamera=" + hasVideoCamera +
                ", wishes='" + wishes + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(short horsepower) {
        this.horsepower = horsepower;
    }

    public short getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(short fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public boolean isAutomaticTransmission() {
        return isAutomaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        isAutomaticTransmission = automaticTransmission;
    }

    public boolean isFrontWheel() {
        return isFrontWheel;
    }

    public void setFrontWheel(boolean frontWheel) {
        isFrontWheel = frontWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeatHeating() {
        return isSeatHeating;
    }

    public void setSeatHeating(boolean seatHeating) {
        isSeatHeating = seatHeating;
    }

    public boolean isLeatherInterior() {
        return isLeatherInterior;
    }

    public void setLeatherInterior(boolean leatherInterior) {
        isLeatherInterior = leatherInterior;
    }

    public boolean isHasNavigator() {
        return hasNavigator;
    }

    public void setHasNavigator(boolean hasNavigator) {
        this.hasNavigator = hasNavigator;
    }

    public boolean isHasVideoCamera() {
        return hasVideoCamera;
    }

    public void setHasVideoCamera(boolean hasVideoCamera) {
        this.hasVideoCamera = hasVideoCamera;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }
}
