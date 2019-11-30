package com.company;

public class Pet {
   private int age;
    private Color color;
    private Shelter shelter;

    public Pet(){

    }

    public Pet( Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefoulttAge() {
        age = (int) (Math.random() * 10 + 5);
        return age;
    }


    public String getInfo() {
        return  "Возраст питомца :" + getAge() +", Название приюта :" + shelter.getName() + ", Адресс приюта :" + shelter.getAddress() + ", Цвет питомца :" + getColor()+" ,";
    }

}
