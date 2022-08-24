package com.company;

public class Uson extends People{
    public Uson(int ad, String firstName, String lastName, int age, String email, String city) {
        super(ad, firstName, lastName, age, email, city);
    }
        @Override
        public void word(){
            System.out.println("Усон дыйкан болуп иштейт");
        }
        @Override
        public void toRelax (){
            System.out.println("3 жолу колго эс алат жылына");
        }
        @Override
        public void communication (){
            System.out.println("Достору коп комуникативный");
        }
        @Override
        public void timeTable(){
            System.out.println("Жумасына 50 саат иштейт");
        }
}
