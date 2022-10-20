package ru.synergy.ConstructorTest;

public class Main {
    public static final Integer MAGNIFIER = 10000; // создание константы увеличивающее в 10000 раз
    public static void main(String[] args) {
        Person person = new Person("Andrey",20);
        person.displayName();
        person.displayAge();
        Person.getCounter();
        Fraction fraction = new Fraction(10,0); // Создание объекта класса Fraction
    }
}
// Создание класса
//---------------------------------------------------------------
class Person{
    //Объявление переменных
      int id;
      String name;
      protected int age;
     private static int counter =0; // Создание счетчика
    //-----------------------------------------------------------------------
    //Создание метода для взятия значения
    public static int getCounter() {
        return counter;
    }
    //--------------------------------------------------
    //Статическая инициализация (примечание для самого себя все переменные,методы которые статичны т.е.
    // имеют слово static пред объявлением будут прогружены первыми вместе с классом перед выполнением программы
    // а также в последующей инициализации и в будующих проектах то что входит в static должно быть объявлено статичным)
        static {
        System.out.println(counter);
    }
public Person(String name,int age){
        id = counter++;
        this.name = name;
        this.age = age;

    }

    // Методы для вывода значений
    //---------------------------
    public void  displayName(){
        System.out.printf("Имя: %s\n", name);
    }
    public void  displayAge(){
        System.out.printf("Возраст: %d\n", age);
    }
    //---------------------------
    // Методы для взятия значений
    //-------------------------
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
   public void setName(String name){
       this.name = name;
    }

    public void setAge(int age) {
        if (age>0 && age<110)
        this.age = age;
    }
    //---------------------------
    //---------------------------------------------------------------
}
//Создание класса для конструктора
class Fraction{
    int numerator;
    int denumerator = 1;
    //Конструктор
    public Fraction(int numerator,int denumerator){
        if (denumerator==0){
            System.out.println("Denomiinator can't be zero");
            return;
        }
        this.numerator = numerator; // Слово this позволяет обратиться к объекту внутри которого работаем т.е. как я понял Класс Fraction если в нем есть конструктор
        // то он является объектом класса
        this.denumerator = denumerator;
    }
    //------------------------------------------
}
