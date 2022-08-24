package com.company;

public class Asan extends People{
    public Asan(int ad, String firstName, String lastName, int age, String email, String city) {
        super(ad, firstName, lastName, age, email, city);
    }
        @Override
        public void word(){
            System.out.println("Asan инженер болуп иштейт");
        }
        @Override
        public void toRelax (){
            System.out.println("Эс алууга убакыт жок");
        }
        @Override
        public void communication (){
            System.out.println("Коп суйлобойт");
        }
        @Override
        public void timeTable(){
            System.out.println("Жумасына 40 саат иштейт");
        }
    }

