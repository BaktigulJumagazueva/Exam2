package com.company;

public abstract class People {
    private int ad;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String city;

    public People(int ad, String firstName, String lastName, int age, String email, String city) {
        this.ad = ad;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    @Override
    public String toString() {
        return "People{" +
                "ad=" + ad +"\n"+
                " firstName='" + firstName + '\'' +"\n"+
                " lastName='" + lastName + '\'' +"\n"+
                " age=" + age +"\n"+
                " email='" + email + '\'' +"\n"+
                " city='" + city + '\'' +"\n"+
                '}';
    }

    public abstract void word ();
    public abstract void toRelax ();
    public abstract void communication ();
    public abstract void timeTable ();
}


