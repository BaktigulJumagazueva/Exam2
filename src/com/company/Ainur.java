package com.company;

public class Ainur extends People{
    public Ainur(int ad, String firstName, String lastName, int age, String email, String city) {
        super(ad, firstName, lastName, age, email, city);
    }
    @Override
    public void word(){
        System.out.println("Айнур ырчы болуп иштейт");
    }
    @Override
    public void toRelax (){
        System.out.println("1 жолу Туркияга 2 жолу Европа олколоруно чыгат");
    }
    @Override
    public void communication (){
        System.out.println("Достору коп комуникативная ");
    }
    @Override
    public void timeTable(){
        System.out.println("Точный график жок");
    }
}
