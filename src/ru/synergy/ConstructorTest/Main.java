package ru.synergy.ConstructorTest;

public class Main {
    public static final Integer MAGNIFIER = 10000; // создание константы увеличивающее в 10000 раз
    public static void main(String[] args) {
        //---------------------------------------------------------------------
        Fraction fraction = new Fraction(10,45); // Создание объекта класса Fraction
        fraction.addNumerator().addNumerator().addNumerator().addNumerator();
        //---------------------------------------------------------------------
        //Создание объекта класса Person
        Person oleg = new Person("Oleg","Olegov",'m');
        System.out.println(oleg);
        //------------------------------------------------------------------------
        // Создание объекта класса Employee
        Employee olga = new Employee("Olga","Svetova",'f',"Buhgalter");

        System.out.println(olga + "\n");
        //---------------------------------
        Person olga2 = olga; // Говорим Яве что объект класса Employee является объектом класса Person
        System.out.println(olga2);
        ((Employee) olga2).WhoAreU(); // Использование метода из класса Employee в объекте класса Person ((Employee) olga2)  - Говорим Яве что объект класса Person
        // является объектом класса Employee
        //---------------------------------
    }
}
// Создание класса
// Создание класса для конструктора
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
    public Fraction addNumerator(){
        this.numerator++;
        return this;
    }
     public Fraction getCuurentObject(){ return this;}
}
// Создание класса Person
class Person{
    //Объявление переменных
   protected String firstName;
    protected String Last_Name;
    protected char gender;
    //----------------------
    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //------------------------------
    public Person(){
        this("","",'-');
    }
    // Создание конструктора
    public Person(String firstName, String Last_Name, char gender){
        this(firstName, Last_Name);
        this.gender = gender;
    }
    //Конвертация в строку для корректного вывода
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", gender=" + gender +
                '}';
    }
    //----------------------------------------------

    public Person(String firstName, String Last_Name){
         this.firstName = firstName;
         this.Last_Name = Last_Name;
    }
    //---------------------------------

}

//Создание класса для наследования
class Employee extends Person{
    protected  String dolznost;

    public Employee(String firstName, String Last_Name, char gender, String dolznost) {
        super(firstName, Last_Name, gender);
        this.dolznost = dolznost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", gender=" + gender + '\'' +
                ",doznnost=" + dolznost +
                '}';
    }
   public void WhoAreU(){
        System.out.println("Hi my  class is:>>> " + this.getClass()); // Метод для отображения класса
    }
}

