# Module 5 Java Programs

This markup file contains all 6 Java programs from Module 5, along with  program output screenshots.

---

## 📌 1. ModulusCalculator.java

```java
import java.util.Scanner;

public class ModulusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 % num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot perform modulus by zero!");
        }
    }
}
``<img width="1920" height="1080" alt="modulas" src="https://github.com/user-attachments/assets/55badb74-849d-4cf9-95d8-40fc5acdc20e" />
`


---

## 📌 2. DynamicArrayAllocation.java

```java
import java.util.Scanner;

public class DynamicArrayAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Array created with size: " + size);
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        }
    }
}
```

<img width="1920" height="1080" alt="dynamicarray" src="https://github.com/user-attachments/assets/d6034258-5399-4fc7-b04d-2950232ea70b" />

---

## 📌 3. NameToIntegerConverter.java

```java
import java.util.Scanner;

public class NameToIntegerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);
            int value = Integer.parseInt(firstThree);

            System.out.println("Converted integer: " + value);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters!");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: First three characters must be digits!");
        }
    }
}
```

<img width="1920" height="1080" alt="nametostring" src="https://github.com/user-attachments/assets/fad89a44-702e-4972-bb0b-6f0209b1b73a" />

---

## 📌 4. FileLineReader.java

```java
import java.io.*;

public class FileLineReader {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(reader);

            System.out.println("First line: " + br.readLine());
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        catch (IOException e) {
            System.out.println("Error: Unable to read file!");
        }
    }
}
```
<img width="1920" height="1080" alt="filelinereader" src="https://github.com/user-attachments/assets/3623207c-adae-4e31-91f0-a45fd98a3f02" />


---

## 📌 5. InvalidEmailException.java

```java
public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
```

---

## 📌 6. EmailValidator.java

```java
import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter email: ");
            String email = sc.nextLine();

            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: '@' symbol missing!");
            }

            System.out.println("Valid Email!");
        }
        catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


<img width="1920" height="1080" alt="emailvalidator" src="https://github.com/user-attachments/assets/5e0ae0b6-6ba1-41d8-a4c4-a4cd67df276e" />

---



# 📘 Concepts Used in Module 5 Programs

## 1️⃣ ModulusCalculator.java — Concepts Used

* Scanner class for user input
* Modulus operator (%)
* ArithmeticException handling
* Try–catch block to prevent program crash

## 2️⃣ DynamicArrayAllocation.java — Concepts Used

* Dynamic array creation using user input
* NegativeArraySizeException handling
* Scanner class for input
* Try–catch error handling

## 3️⃣ NameToIntegerConverter.java — Concepts Used

* String manipulation using substring()
* Type conversion using Integer.parseInt()
* StringIndexOutOfBoundsException
* NumberFormatException
* Multiple catch blocks

## 4️⃣ FileLineReader.java — Concepts Used

* FileReader and BufferedReader for file reading
* FileNotFoundException handling
* IOException handling
* Resource closing using br.close()

## 5️⃣ InvalidEmailException.java — Concepts Used

* Custom exception class creation
* Extending Exception class
* Using super() to pass message

## 6️⃣ EmailValidator.java — Concepts Used

* Email format validation
* Checking for '@' symbol
* Throwing custom exception
* Try–catch block handling
* Scanner for user input



