package ru.synergy.InterfaceTest;

public class Main {
    public static void main(String[] args) {
     //Book
    Book book = new Book("Danwich horror", "Lovecraft"); // Объект класса Book
    book.print(); // Использование метода из класса Printable и реализованный в файле Main.java
    book.read("This is run upon Book");
    //----------------------------------------------
     //Journal
    Journal journal = new Journal("Journal Name"); // Объект класса Journal
    journal.getName();
    journal.print(); // Использование метода из класса Printable и реализованный в файле Main.java
    printable PrJournal = journal; // Создание объекта интерфейса и  последующего приравнивания объекта класса Journal
        // к объекту Интерфейса printable
    PrJournal.print(); // Использование метода из класса Printable и реализованный в файле Main.java
    journal.read("This is run upon Journal");
    //-------------------------------------------------------------
    }
}
// Создание класса Book наследующий все методы из printable
class Book implements printable{
    // Создание переменных
    String name;
    String author;
    //-------------------------
    //Создание конструктора
    public Book(String name, String author) {
        this.name = name;
        this.author = author;

    }
    //----------------------------------
    // Реализация метода вывода из интерфейса Printable
    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name,author);
    }
    //-------------------------------------------------
}
// -----------------------------------------------------------------------
// Создание класса Journal наследующий все методы из printable
class Journal implements printable{
    //Создание переменной
     private String name;
    //--------------------------------
    // Метод взятия имени
    public String getName() {
        return name;
    }
    //--------------------------------
    //Конструктор
    public Journal(String name) {
        this.name = name;
    }
    //------------------------
    //Реализация метода вывода
    @Override
    public void print() {
        System.out.println(name);
    }
    //-------------------------------
}
//--------------------------------------------------------