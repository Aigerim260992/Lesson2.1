package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(6);
        dog.setName("Эффа");
        dog.setCommands("Фас");
        dog.setBreed("{Алабай");
        dog.setShelter(new Shelter("Дом", "Серова 49"));

        Dog dog1 = new Dog(Color.BLACK, new Shelter("Улыбка", "Фрунзе 19"), "Кара", "Хаски");
        dog1.setAge(4);
        dog1.setCommands("Сидеть");


        Dog dog2 = new Dog("Рекс", "Овчарка", "Лежать", new Shelter("Надежда", "Чуй 27"), Color.GREY);
        dog2.setAge(8);

        System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());

        dog.makeVoice("Гав- Гав");
        dog1.makeVoice(3, "РРР");
        dog2.makeVoice("Ав-Ав", 5);
    }


}


