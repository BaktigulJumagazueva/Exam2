package com.company;

public class Adul extends People{
    public Adul(int ad, String firstName, String lastName, int age, String email, String city) {
        super(ad, firstName, lastName, age, email, city);
    }
    @Override
    public void word(){
        System.out.println("Адыл программист болуп иштейт");
    }
    @Override
    public void toRelax (){
        System.out.println("3 жолу колго эс алат жылына жана Евровада 1 жолу эс алат");
    }
    @Override
    public void communication (){
        System.out.println("Достору коп комуникативный амбициозный");
    }
    @Override
    public void timeTable(){
        System.out.println("Жумасына 40 саат иштейт");
    }
}
