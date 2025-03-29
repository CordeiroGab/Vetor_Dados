package Entities;

public class Data {
    private String name;
    private int age;
    private double height;

    private double averageHeight;

    public Data() {}


    public Data(double averageHeight) {
        this.averageHeight = averageHeight ;
    }
    public Data(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(double averageHeight) {
        this.averageHeight = averageHeight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height;
    }
}
