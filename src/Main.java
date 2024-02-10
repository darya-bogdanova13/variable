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

    }
}