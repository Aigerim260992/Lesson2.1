package com.company;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;



    public Dog() {}

    public Dog(Color color, Shelter shelter, String name, String breed) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }


    public Dog(String name, String breed, String commands, Shelter shelter,Color color) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }


    void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);

        };
    };


    void makeVoice(String voice) {
        System.out.println(voice);
    };


    void makeVoice(int number,String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);

        }
        System.out.println();

    };

    @Override
    public String getInfo() {
        return "Кличка собаки :" + getName() + ", Порода собаки:" + getBreed() + ", команда собаки :" + getCommands() + super.getInfo();
    }


}

