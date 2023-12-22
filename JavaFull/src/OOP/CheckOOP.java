package OOP;

public class CheckOOP {
    public static void main(String[] args) {
        SchoolBoy s=new SchoolBoy();
        System.out.println(s.showInfo());
    }
}


//   === INHERITANCE===
/** Single  /  Multilevel   /  Hierarchical   only support
*
*   multiple inheritance not support in java
*   Hybrid also not support
*
*
*   To reduce the complexity and simplify the language, multiple inheritance is not
*  supported in java.

    Consider a scenario where A, B, and C are three classes.
* The C class inherits A and B classes. If A and B classes
* have the same method and you call it from child class object,
* there will be ambiguity to call the method of A or B class.

    Since compile-time errors are better than runtime errors,
* Java renders compile-time error if you inherit 2 classes.
* So whether you have same method or different, there will
* be compile time error
*
*
*
* */

/**
======= ENCAPSULATION =======

        Encapsulation in Java
        Encapsulation in Java is a process of wrapping code and data together
        into a single unit, for example, a capsule which is mixed of several
        medicines.


        We can create a fully encapsulated class in Java by making all
        the data members of the class private. Now we can use setter and
        setter methods to set and get the data in it.

        The Java Bean class is the example of a fully encapsulated class.


        By providing only a setter or getter method,
        you can make the class read-only or write-only.
        In other words, you can skip the getter or setter methods.
        Play




        It provides you the control over the data. Suppose you
        want to set the value of id which should be greater than 100 only,
        you can write the logic inside the setter method. You can write the
        logic not to store the negative numbers in the setter methods.

        It is a way to achieve data hiding in Java because
        other class will not be able to access the data through
        the private data members.

        The encapsulate class is easy to test. So, it is better for unit testing.
**/



