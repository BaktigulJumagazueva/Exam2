package com.company;

public class Akyl extends People{
    public Akyl(int ad, String firstName, String lastName, int age, String email, String city) {
        super(ad, firstName, lastName, age, email, city);
    }
    @Override
    public void word(){
        System.out.println("Акыл  актер болуп иштейт");
    }
    @Override
    public void toRelax (){
        System.out.println("коп жолу эс алат жылына");
    }
    @Override
    public void communication (){
        System.out.println("Достору коп комуникативный");
    }
    @Override
    public void timeTable(){
        System.out.println("Точный график жок");
    }
}
