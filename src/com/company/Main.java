package com.company;

class Person{
    private String name;
    private String address;
    public Person(){
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return "Person [name: "+getName()+" address: "+getAddress()+"]";
    }
}
class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(){}
    public Student(String program,int year,double fee, String name, String address){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public String getProgram(){
        return program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public double getFee(){
        return fee;
    }
    @Override
    public String toString(){
        return "Students[Person[name= "+getName()+",address= "+getAddress()+"],program= "+getProgram()+" year="+getYear()+",fee="+getFee()+"]";
    }
}
class Staff extends Person{
    private String school;
    private double pay;
    public Staff(){}
    public Staff(String school,double pay, String name, String address){
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public double getPay(){
        return pay;
    }
    @Override
    public String toString(){
        return "Staff[Person[name= "+getName()+",address= "+getAddress()+"],school="+getSchool()+"pay= "+getPay()+"]";
    }
}
public class Main {

    public static void main(String[] args) {
        Person person = new Person("john","Ireland");
        System.out.println(person);
        person = new Student("IT",2014,1000,"Jack","England");
        System.out.println(person);
        person = new Staff("Yale",1000,"James","America");
        System.out.println(person);
    }
}
