import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! ");

        System.out.println(5 + 5 - 7 + "  ");
        System.out.println(15 % 4); // Оператор модуль - остаток после деление

        /*
        пиши сколько хочешь
        и где хочешь
        */

// обьявеление и инизализация переменной/Создание и присваивание значения переменной
        //int переменна круглый чисель
        int ageOfMyFriend = 16;
        System.out.println("Age of my friend Islam: " + ageOfMyFriend + " yeas old");
        System.out.println("After five years age my friend will be: " + (ageOfMyFriend + 5));

        ageOfMyFriend = 18;
        System.out.println("Age of my new friend Tima: " + ageOfMyFriend);

        int ageOfMyFriend2 = 17;
        System.out.println("Age of my friend Sanjar: " + ageOfMyFriend2);

        // float double = не целые числа:23.5,16.9
        //  boolean = true или false,правда или ложь
        double weightOfFriend = 63.55;
        float weightOfFriend1 = 43.66f;

        boolean isRainy = false;

        char myFavoriteSymbol = '$';

        int apples; // Обьявление переменной / Создание переменной
        System.out.println("Go to the garden......");
        apples = 4; // Инизализация значение
        apples = 5;
        System.out.println("I found " + apples + " apples in the garden.");

        System.out.println("Values of variables: " + " " + weightOfFriend + " " + isRainy + " " + myFavoriteSymbol);

        String nameOfMyFreind = "Darika"; // String это текст переменные

        final String COUNTRY_TITLE = "Kyrgyzstan"; // final не дает изменить переменную

        // домашка

        String someWord;
        final int NUM = 16;
        String word = "Aman";

        someWord = word + NUM;
        System.out.println(someWord + "  " + NUM + word);

        // {}-тела внутри тела пишешь функции которые относятся к классу котором стоить эта тела

        if (NUM < 0) {

            System.out.println("вы сохранили отрицательное число:");

        } else if (NUM > 0) {

            System.out.println("вы сохранили положительное число:");

        } else {

            System.out.println("вы сохранили ноль:");

        }

        Scanner s = new Scanner(System.in);
        System.out.println("введите ваше имя:");
        String name = s.nextLine();
        System.out.println("привет" + name);

        String myFreind = "Tima";
        int vosrost = 18;
        System.out.println("моего друга зовут " + myFreind + "  ему  " + vosrost);

        int num = 18;
        if (num > 17) {
            System.out.println("на улице жарко");
        } else if (num < 12) {
            System.out.println("на улице холодно");
        } else {
            System.out.println("на улице солнечьная погода ");
        }

    }
}



