package ru.synergy.InterfaceTest;

public interface printable {
    void print(); // Обычный метод
    default void read( String AppendedText){ // Метод который имеется только в классе printable
        System.out.println("Print with printable " + AppendedText);
    }
}
