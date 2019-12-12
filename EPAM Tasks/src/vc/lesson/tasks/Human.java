package vc.lesson.tasks;

import java.util.Calendar;

public class Human {

    public String name;
    public String surname;
    private String gender;
    private int age;
    private int birthYear;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "Male" || gender == "male" || gender == "Female" || gender == "female")
            this.gender = gender;
        else System.out.println("Such gender did not created by nature");
    }

    public int getAge() {
        if (birthYear > 0 && birthYear <= Calendar.getInstance().get(Calendar.YEAR))
            return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
        else return -1;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 0 && birthYear <= Calendar.getInstance().get(Calendar.YEAR))
            this.birthYear = birthYear;
        else System.out.println("You entered wrong birth year");
    }

    public Human(String name, String surname, String gender, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    //1․ Գրել մեթոդ, որը ստանում է պարամետր Human object, տպել "Yes" եթե տղա է և "No" եթե աղջիկ է։
    public static void printYesOrNo(Human human) {
        if (human.gender == "Male") {
            System.out.println("Yes");
        } else System.out.println("No");
    }


    //2․ Գրել մեթոդ, որը ստանում է պարամետր 3 հատ Human object և վերադարջնում տարիքով ամենամեծի ազգանունը։
    public static String printBiggestHumanSurname(Human human1, Human human2, Human human3) {
        if (human1.getAge() > human2.getAge() && human1.getAge() > human3.getAge()) {
            return human1.surname;
        } else if (human2.getAge() > human1.getAge() && human2.getAge() > human3.getAge()) {
            return human2.surname;
        } else return human3.surname;
    }

    //3․ Գրել մեթոդ, որը ստանում է պարամետր 2 հատ Human object և տպել անունները կողք կողքի։
    public static String printSurnames(Human human1, Human human2) {
        return human1.surname + ' ' + human2.surname;
    }

    //4․ Գրել մեթոդ, որը ստանում է պարամետր մեկ boolean և մեկ Human object, տպել Human-ի անունը եթե boolean=true և ազգանունը, եթե boolean=false։

    public static void printNameOrSurname(boolean flag, Human human) {
        if (flag) System.out.println(human.name);
        else System.out.println(human.surname);
    }

    //3․ Գրել մեթոդ, որը ստանում է պարամետր Human-նների զանգված և տպել աճման կարգով ըստ ծննդյան տարեթվի։

    public static void humanBubbleSort(Human[] human) {
        for (int i = human.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (human[j].getBirthYear() < human[j + 1].getBirthYear()) {
                    Human temp = human[j];
                    human[j] = human[j + 1];
                    human[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < human.length; k++) {
            System.out.println(human[k].name);
        }
    }


//    public static void main(String[] args) {
//        Human human1 = new Human("Ashot", "Ashotyan", "Female", 1977);
//        Human human2 = new Human("Hakob", "Hakobyan", "Male", 1968);
//        Human human3 = new Human("Anna", "Sargsyan", "Female", 2000);
//        Human human4 = new Human("Karen", "Karapetyan", "male", 2010);
//        Human human5 = new Human("Nikol", "Pashinyan", "Male", 1971);
//
//        Human[] humans = {human1, human2, human3, human4, human5};
//        humanBubbleSort(humans);
}
