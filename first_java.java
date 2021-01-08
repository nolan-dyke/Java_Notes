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

// Java Operators

/* 
Arithmentic
++x to increment
--x to decrement

Comparison
== Equal to 
!= Not equal
> Greater than
< Less than
>= Greater than or equal to
<= Less than or equal to

Logical
&& Logical and
|| Logical or
! Logical not

Bitwise
used to perform binary logic with bits of an integer or long integer

& sets each bit to 1 if both bits are 1
| sets each bit to 1 if any of the two bits is 1
~ inverts all bits
^ sets each bit to 1 if only one of the two bits is 1
*/

// Java Strings

/*
String values are surrounded by "double quotes".
In Java, a String is an object, with methods that can perform operations on a string.
e.x.:
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the string is: " + txt.length());
Prints: The length of the txt string is: 26

More string methods:
.toUpperCase()
.toLowerCase()
.indexOf("")

Strings can be concatenated with + and also concat()

Backslash (\) is the escape character
*/

// Java Math

/*
Math is a Java class with methods associated with it.
Math.max()
.min()
.sqrt()
.abs()
.random()
*/

// If...else, Switch, While, For, Break/Continue

/* 
if (condition) {

} else if (condition 2) {

} else {

}

Ternary Operator
variable = (condition) ? expressionTrue : expressionFalse;

Switch Statement

switch(expression) {
    case x:
        // code block
        break;
    case y:
        //code block;
        break;
    default:
        //code block
}

While loop
while (condition) {

}

Do While loop
do {

} while (condition);

For Loop

for (statement 1; statement 2; statement 3){
    code to be executed
}

For-Each Loop
for (type variableName : arrayName){
    code to be executed
}
*/

// Break and Continue

/*
break can be used to jump out of a loop
e.x.:
for (int i = 0; i < 10; i++){
    if (i == 4) {
        break;
    }
    system.out.println(i);
}

continue breaks one iteration in the loop if a condition is true and continues 
with the next iteration in the loop
e.x.:
for(int i = 0; i < 10; i++){
    if (i==4){
        continue;
    }
    system.out.println(i);
}
prints: 0 1 2 3 5 6 7 8 9
*/

// Java Arrays

/*
declared by defining the variable type with square brackets

String[] cars;

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};

values of an array can be changed my referencing the element
cars[0] = "Opel";

can find array length using .length

Loop through an Array
for (int i = 0; i < cars.length; i++){
    code block
}

for (type variable : arrayname) {
    ...
}

Multidimensional Arrays

int[][] myNumbers = {{1, 2 3, 4}, {5, 6, 7}};
*/