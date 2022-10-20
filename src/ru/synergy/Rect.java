package ru.synergy;

//Памятка
/*class ИмяКласса{
//Переменные
типПоля 1 имяПоля1;
типПоля 2 имяПоля2;
//----------------
Тип результата имяМетода1(Параметры метода){
//Тело метода}
Тип результата имяМетода2(Параметры метода){
//Тело метода
}
* */
public class Rect {
    // Переменные
    double width;
    double height;
    Rect rect;
    String NameofRect;
    //-----------------------------------
    //Вычисление площади
    double  getArea(){
        return width*height;
    }
    //---------------------------------
    //Вычисление коэффицента
    void modify( double koeff){
        width+=koeff;
        height +=koeff;
    }
    //--------------------------------------------
    //Конвератация в строку?
    public String toString(){
        return "Rect{" +
                "width"+ width +
                "height" + height +
                "height"  + rect +
                "NameofRect" + NameofRect;
    }
    //-------------------------------------
}
