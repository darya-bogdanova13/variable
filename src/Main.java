public class Main {
    public static void main(String[] args) {
        // write your code here
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box=box*3;
        System.out.println(box);
        box=box/4;
        System.out.println(box);

        var lifttingCopacity=50;
        var stuffWeight=20;
        var copacityLeft= lifttingCopacity-stuffWeight;
        System.out.println ("Еще можно положить" + copacityLeft+"кг вещей");

        var appleWeight=2;
        var orangesWeight=3;
        var frutWeight=appleWeight+orangesWeight;
        System.out.println("Общий вес фруктов" +frutWeight);

        var meatWeight=4;
        var waterWeight=5;
        var tomatoesWeight=2;
        var cucumberWeight=2;
        var pepperWeight= 2;
        var zucchiniWeight= 2;
        var vegetableWeight = tomatoesWeight+cucumberWeight+pepperWeight+zucchiniWeight;
        var productsWeight = frutWeight+vegetableWeight+waterWeight+meatWeight;
        System.out.println ("Общий вес продуктов"+productsWeight+"кг!");

        var leftWeight = lifttingCopacity-stuffWeight-productsWeight;
        System.out.println("Места осталось" + leftWeight + "кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов" + productsWeight);

        leftWeight = lifttingCopacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + "кг!");

        var overload = (stuffWeight + productsWeight) % lifttingCopacity;
        System.out.println("Перегруз на " + overload + "кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в обной машине теперь " + productsInOneCar);

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 7763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        System.out.println(boxer1);

        var boxer2 = 82.7;
        System.out.println(boxer2);

        var boxerWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + boxerWeight);

        var differenceWeight = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов " + differenceWeight);

        var overWeight = (boxer2 + boxer1) % differenceWeight;
        System.out.println("Перевес на " + overWeight + "кг!");

        var totalTime = 640;
        System.out.println(totalTime);

        var oneEmployee = 8;
        System.out.println(oneEmployee);

        var totalEmployees = totalTime / oneEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек ");

        var employees = totalEmployees + 94;
        System.out.println("Теперь сотрудников " + employees + " человека ");

        var totalPerson = totalTime / employees;
        System.out.println("Если в компании работает 174 человека, то всего " + totalPerson + " часа работы может быть поделено между сотрудниками ");

    }
}