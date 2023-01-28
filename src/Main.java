public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2(){
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3(){
        System.out.println("Задача 3");
        var dog = 12.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var redboxerWeigth = 78.2;
        var blueboxerWeigth = 82.7;
        var totalfightersWeigth = redboxerWeigth + blueboxerWeigth;
        System.out.println("Общий вес бойцов " + totalfightersWeigth + " кг");
        var differenceWeigth = blueboxerWeigth - redboxerWeigth;
        System.out.println("Весовая разница бойцов " + differenceWeigth + " кг");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var redboxerWeigth = 78.2;
        var blueboxerWeigth = 82.7;
        var differenceWeigth = blueboxerWeigth % redboxerWeigth;
        System.out.println("Весовая разница бойцов " + differenceWeigth + " кг (2 способ)");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var generalopeningHours = 640;
        var employeeworkingHours = 8;
        var employeesCompany = generalopeningHours / employeeworkingHours;
        System.out.println("Всего работников в компании - " + employeesCompany + " человек");

        var workingHours = 8;
        var oldemployeesCompany = 80;
        var newemployeesCompany = 94;
        var allemployeesCompany = oldemployeesCompany + newemployeesCompany;
        var allopeningHours = allemployeesCompany * workingHours;
        System.out.println("Если в компании работает " + allemployeesCompany + " человек," + " то всего " + allopeningHours + " часов работы может быть поделено между сотрудниками.");

    }
}
