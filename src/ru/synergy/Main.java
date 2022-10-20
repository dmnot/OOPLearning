package ru.synergy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Взаимодействие с классом Rect
        //--------------------------------------------------------------------------------------------------------------
        /*Rect rect = new Rect(); // Объект класса Rect
        //Переменные
        rect.height = 10;
        rect.width = 15;
        rect.NameofRect = "I m rect";
        //-------------------------------------------------------------------------------
        Rect rect1 = new Rect(); // Объект класса Rect
        //Переменные
        rect1.height = 5;
        rect1.width = 25;
        rect1.NameofRect = "I m rect 1";
        //----------------------
        Rect rect2 = new Rect(); // Объект класса Rect
        //Переменные
        rect2.height = 1;
        rect2.width = 2;
        rect2.NameofRect = "I m rect 2";
        //----------------------------------------------------------------------
        System.out.println( "Result:>>>" + rect.getArea()); // Вывод результата
        System.out.println( "Result:>>>" + rect1.getArea()); // Вывод результата
        System.out.println( "Result:>>>" + rect2.getArea()); // Вывод результата
        //----------------------------------------------------------------------
        rect2.modify(1.5);
        System.out.println( "вычисление с коэффицентом:" + rect2.getArea());
        //---------------------------------------------------------------------*/

        //--------------------------------------------------------------------------------------------------------------
/*
        // Взаимодействие с классом Point

        // Создание объектов класса Point
        Point point1 = new Point();
        Point point2 = new Point();
        //------------------------------

        point1.input(); //Ввод значение х
        System.out.println(point1);

        point2.input(); //Ввод значение у
        System.out.println(point2);

        System.out.println(point1.getDistance(point2)); // на какое расстояние будет перемещена точка 1

        System.out.println("Start moving the point1..");
        point1.move(100,120); // перемещение
        System.out.println(point1);

        System.out.println(point1.getDistance(point2));
*/
 //-----------------------------------------------------------------------
        //Объявление переменных чрез классы
        Double a = Double.valueOf(10.0); // Объявление переменной
        double a1 = a.doubleValue();  // Присваивание переменной значения той переменной которая была объявлена чрез класс Double
        System.out.println("число(double):>>>" + a1);
        //--------------------------------------------
        a.toString(); //онвертация значения переменной в строку
        String astr = "156"; // Строка с числом внутри
        Integer convstr = Integer.parseInt(astr); //Конвертация в число int
        System.out.println("Конвертированное число из String в int:>>>" + convstr);
        int c = convstr; // Автораспоковка
        convstr = c; // Автоупаковка

    }
}
