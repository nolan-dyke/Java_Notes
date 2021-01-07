/*
Every Java application begins with a class name (should match the file name).
NOTE Java uses CamelCase, however, the public class should be declared in the file.
*/

public class first_java {
    public static void main (String[] args) {
        String message = "Hello World";
        System.out.println(message);
    }
}

// To compile the code: $javac first_java.java
// To run the code: $java first_java.java

// The main() method is required, any code inside of main() will be executed.

// Each code statements must end with a semicolon.

// Java Variables

/*
String
int
float
char
boolean

to declare: 
type variable = value;
e.x.:
String name = "Nolan";

assigning a new variable to existing variables will overwrite the variable

*** can use the keyword final if you don't want a variable to be overwritten
e.x. 
final int myNum = 15;

can concatenate strings with +

can delcare multiple variables of the same type at once:
int x = 5, y = 6, z = 50;

names of variables are called identifiers
*/

// Data Types

/* 
Primitive Data Types
byte, short, int, long, float, double, boolean, char
Specifies the size and type of variable values, and it has no additional methods
Must have a value, cannot be null.
Identified with lowercase letter.

Non-primitive Data Types
String, Arrays, Classes, Interface
Predefined in Java. With the exception of String, they are defined by the programmer.
Can be used to call methods to perform operations.
Can have a value of null.
Start with Uppercase letters.
Non-primitive types have all the same size.
*/

// Java Type Casting

/* 
Assigning a value of one primitive data type to another type.
Widening Casting(automatically)
converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

e.x.:
int myInt = 9;
double myDouble = myInt; Automatically casting int to double

Narrowing Casting(manually)
converting a larger type to a smaller type size
done by placing the type in parentheses in front of the value
e.x.:
double myDouble = 9.78;
int myInt = (int) myDouble; Manually casts double down to int
*/