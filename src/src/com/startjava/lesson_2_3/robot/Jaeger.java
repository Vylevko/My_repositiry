package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private float height;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
        this("Default model", "Mark-1", "USA", 2.1f, 77.4f, 7, 7, 7);
    }

    public Jaeger(Jaeger j) {
        this(j.modelName, j.mark, j.origin, j.weight, j.height, j.speed, j.strength, j.armor);
    }

    public Jaeger(String modelName, String mark, String origin, float weight, float height, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println("Drifting");
        return true;
    }

    public void move() {
        System.out.println("Moving");
    }

    public String SkanKaiju() {
        System.out.println("Skanning Kaiju");
        return "Nothing";
    }

    public void useVortexCannon() {
        System.out.println("Using Vortex Cannon");
    }
}
