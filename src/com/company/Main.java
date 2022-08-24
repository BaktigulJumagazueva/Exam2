package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Asan asan = new Asan(5467, "Asan", "Aliev", 25, "ASAN.@gmail.com ", " Bishkek");
        Uson uson = new Uson(7689, "Uson", "Bechelov", 26, "USON.@gmail.com", "Bishkek");
        Adul adul = new Adul(1243, "Adul", "Nurmatov", 28, "ADUL.@gmail.com", "Bishkek");
        Akyl akyl = new Akyl(9867, "Akyl", "Muratov", 29, "AKYL.@gmail.com", "Bishkek");
        Ainur ainur = new Ainur(5467, "Ainur", "Akimova", 35, "AINUR.@gmail.com", "Bishkek");

        if (asan.getFirstName().equals("Asan")) {
            System.out.println("Туура");
        } else {
            System.out.println("Туура эмес");
        }if (uson.getFirstName().equals("Uson")) {
            System.out.println("Туура");
        } else {
            System.out.println("Туура эмес");
        }if (adul.getFirstName().equals("Adul")) {
            System.out.println("Туура");
        } else {
            System.out.println("Туура эмес");
        }if (akyl.getFirstName().equals("Akyl")) {
            System.out.println("Туура");
        } else {
            System.out.println("Туура эмес");
        }if (ainur.getFirstName().equals("Ainur")) {
            System.out.println("Туура ");
        } else {
            System.out.println("Туура эмес");
        }

        //2
        if (asan.getAge() < 0) {
            System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
        }
        if (asan.getAge() > 100) {
            System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
        }
            if (uson.getAge() < 0) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (uson.getAge() > 100) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (adul.getAge() < 0) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (adul.getAge() > 100) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (akyl.getAge() < 0) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (akyl.getAge() > 100) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (ainur.getAge() < 0) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }
            if (ainur.getAge() > 100) {
                System.out.println(" Терс сан берууго жанан жок жаш берууго болбойт");
            }

            //3
            if (asan.getEmail().contains("@")) {
                System.out.println("@ bar");
            } else {
                System.out.println("@ жок кайрадан текшериниз");
            }
            if (uson.getEmail().contains("@")) {
                System.out.println("@ bar");
            } else {
                System.out.println("@ жок кайрадан текшериниз");
            }
            if (adul.getEmail().contains("@")) {
                System.out.println("@ bar");
            } else {
                System.out.println("@ жок кайрадан текшериниз");
            }
            if (akyl.getEmail().contains("@")) {
                System.out.println("@ bar");
            } else {
                System.out.println("@ жок кайрадан текшериниз");
            }
            if (ainur.getEmail().contains("@")) {
                System.out.println("@ bar");
            } else {
                System.out.println("@ жок кайрадан текшериниз");
            }
            People[] people = {asan, uson, adul, akyl, ainur};
            for (People i : people) {
                System.out.println("=========================================================");
                System.out.println(i.getFirstName() + " " + i.getLastName() + " " + i.getAd() + " " + i.getAge() + " " + i.getCity() + " " + i.getEmail());
i.word();
i.toRelax();
i.communication();
i.timeTable();
            }
            System.out.println("=============================================");



                Asan[] asans = {asan};
             Uson[] usons = {uson};
            Adul[] aduls = {adul};
            Akyl[] akyls = {akyl};
            Ainur[] ainurs = {ainur};
        }
    }
