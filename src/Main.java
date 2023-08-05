import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Univer univer = new Univer();
        univer.setName("Студенты: ");
        univer.setKol(2000);

        Univer unive = new Univer();
        unive.setName("Преподователи:  ");
        unive.setKol(250);

        Univer uni = new Univer();
        uni.setName("Другие работники:  ");
        uni.setKol(40);
        Univer[] sotavUniver = {univer,unive,uni};


        School school = new School();
        school.setName("Малчики: ");
        school.setKol(489);

        School schoo = new School();
        schoo.setName("Девочки: ");
        schoo.setKol(511);

        School scho = new School();
        scho.setName("Учичтели: ");
        scho.setKol(511);
        School [] sostavSchool ={school,schoo,scho};


        Car car = new Car();
        car.setName("Mercedes: ");
        car.setKol(12);

        Car ca = new Car();
        ca.setName("BMW: ");
        ca.setKol(18);

        Car c = new Car();
        c.setName("Volkswagen: ");
        c.setKol(30);
        Car [] marki = {c,ca,car};


        Person person = new Person();
        person.setName("Отeц: ");
        person.setAga(34);

        Person perso = new Person();
        perso.setName("Мать: ");
        perso.setAga(30);

        Person pers = new Person();
        pers.setName("Дочь: ");
        pers.setAga(9);

        Person [] semya = {person,perso,pers};

        System.out.println("Университет!");
        System.out.println();
        System.out.println(Arrays.toString(sotavUniver));
        System.out.println();
        System.out.println("Школа!");
        System.out.println();
        System.out.println(Arrays.toString(sostavSchool));
        System.out.println();
        System.out.println("Автослон!");
        System.out.println();
        System.out.println(Arrays.toString(marki));
        System.out.println();
        System.out.println("Семья!");
        System.out.println();
        System.out.println(Arrays.toString(semya));



    }
}