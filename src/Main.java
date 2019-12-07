/*
 * Quick-Java8-CheatSheet - A Java 8 cheat sheet that covers most of Java 8 basics.
 * Copyright (C) 2019 TrackRunny

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


// - Any code that is commented out has user input, uncomment it if you want to run it.

import java.util.Scanner;
import java.util.InputMismatchException;

// - Ignore these imports until line 862
import package_one.SampleClassOne;
import package_two.SampleClassTwo;
import package_modifers.Modifiers;

public class Main {

    public static void main(String[] args) {

        /*
            - IntelliJ Shortcuts
            - psvm == public static void main(String[] args) {}
            - sout == System.out.println();

        */

        // - Divider to make the code easy to read.

        String divider = "————————————————————————————————————————————————————————";


        // ————————————————————————————————————————————————————————
        // - VARIABLES && DATA TYPES
        // ————————————————————————————————————————————————————————


        // - Declaring a string
        String name = "John";
        // - Declaring a char, which can only have one letter. - MUST USE SINGLE QUOTES FOR CHARS! ( '' )
        char grade = 'A';
        // - Declaring a integer which is a number.
        int number1 = 100;
        // - A double is a decimal number.
        double number2 = 9.3;
        // - Declaring a boolean, True or false values.
        boolean is_work_done = false;
        boolean is_trash_taken_out = true;


        // - Printing out the values to the screen.
        System.out.println(name);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(grade);
        System.out.println(is_trash_taken_out);
        System.out.println(is_work_done);

        // - Combining some of the variables in a sentence.

        System.out.println("Hey, " + name + " My favorite number is " + number1 + ". " + "If the trash is not taken out" +
                " then you need to take it out." + " Also, if your work is not done you should complete it by tonight.");

        // - Updating the variables in the code.

        is_work_done = true;
        name = "Bob";

        System.out.println(is_work_done + ", " + name);

        System.out.println(divider + " [VARIABLES ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - WORKING WITH STRINGS
        // ————————————————————————————————————————————————————————


        // - Prints out a string.
        System.out.println("This is a string in Java.");
        // - Prints out text on another line.
        System.out.println("This will print out a NEW\nLINE.");
        // - Put quotation marks in a string.
        System.out.println("This \"WORD\" has quotes around it.");
        // - Put a backslash in a string.
        System.out.println("This \\WORD\\ has some backslash's next to it.");
        // - Put text on a new line if it goes beyond the screen.
        System.out.println("This is some random test text so that the other part of the text can go off the screen because this line is" +
                " Way to big.");
        // - Print out a String variable.
        String java = "Java is amazing";
        System.out.println(java);
        // - Make the variable ( java ) uppercase.
        System.out.println(java.toUpperCase());
        // - Make the variable ( java ) lowercase.
        System.out.println(java.toLowerCase());
        // - Get the length of the string inside the variable ( java )
        System.out.println(java.length());
        // - Check if the variable contains a letter or word inside of it. Returns true or false values.
        System.out.println(java.contains("Java"));
        System.out.println(java.contains("cat"));
        // - Will give the index position where character in the string is located. Starts from 0, not 1.
        System.out.println(java.charAt(0));
        System.out.println(java.charAt(5));
        // - Find the index of a character in the string.
        System.out.println(java.indexOf("J"));
        System.out.println(java.indexOf("i"));
        // - Get a certain part of the string. You can also pass in more than one index value too.
        System.out.println(java.substring(8));
        System.out.println(java.substring(5));
        System.out.println(java.substring(5, 8));
        // - Grab the first word in the string with some of the methods learned so far. This will stop at the first word and get it.
        System.out.println(java.substring(0, java.indexOf(" ")));

        System.out.println(divider + " [WORKING WITH STRINGS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - MATH & NUMBERS IN JAVA
        // ————————————————————————————————————————————————————————


        // - Printing out a number on the screen.
        System.out.println(10);
        // - Adding two numbers together.
        System.out.println(4 + 4);
        // - Subtract 8 from 10 and get a negative number.
        System.out.println(8 - 10);
        // - Multiplying two numbers.
        System.out.println(8 * 10);
        // - Dividing two numbers.
        System.out.println(10 / 5);
        // - Dividing and Multiplying negative numbers.
        System.out.println(-10 * 5);
        System.out.println(7 / -2);
        // - Dividing & Multiplying & Adding & Subtracting doubles together allows you to get a decimal answer back.
        System.out.println(7.0 + -2.5);
        System.out.println(7.0 - 2.5);
        System.out.println(7.0 * -2.5);
        System.out.println(7.0 / -2);
        // - Simple MOD equation (Spits out the remainder in the equation)
        System.out.println(10 % 3);
        // - Storing numbers in variables.
        int int_number = 3;
        double double_number = -3.5;

        System.out.println(int_number + 10);
        // - Adding a int and double together will equal a double answer.
        System.out.println(int_number + double_number);

        // - Using more advanced math functions in Java.

        // - Find the smaller number.
        System.out.println(Math.min(10, 20));
        // - Find the bigger number.
        System.out.println(Math.max(10, 20));
        // - Round a number ( Regular rounding rules apply )
        System.out.println(Math.round(double_number));
        // - Floor a number ( Rounds down to the lowest whole number )
        System.out.println(Math.floor(8.8));
        // - Ceil a number ( Rounds to the highest whole number )
        System.out.println(Math.ceil(8.2));
        // - Get the absolute value of a number.
        System.out.println(Math.abs(double_number));
        // - Take a number and multiply it from a set power number.
        System.out.println(Math.pow(int_number, 3));
        // - Find the square root of a number ( NOTE: YOU CAN ALSO USE VARIABLES IN THIS TOO! )
        System.out.println(Math.sqrt(36));

        System.out.println(divider + " [MATH & NUMBERS IN JAVA ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - TAKING IN USER INPUT
        // ————————————————————————————————————————————————————————

        /*
        // Makes a new scanner which will take input.
        Scanner input_color = new Scanner(System.in);
        // This will print out text for the user to see and give input too.
        // We are not using println because then that will put the text the user puts on a new line.
        System.out.print("Enter your favorite color: ");
        // The program will stop and wait for the user to enter some text into it before continuing.
        String color = input_color.nextLine();

        // This will print out the color the user choose, along with making it lowercase.
        System.out.println("Nice choice, " + color.toLowerCase() + " is a great color!");

        System.out.println(divider + " [TAKING IN USER INPUT ⤴ ]");
        */

        // ————————————————————————————————————————————————————————
        // - BUILDING A BASIC CALCULATOR
        // ————————————————————————————————————————————————————————

        /*
        // - Making a new scanner that will take input.
        Scanner input_number1 = new Scanner(System.in);
        // - Print out a prompt for the user to enter.
        System.out.print("Enter your first number that will be added: ");
        // - Program will stop and wait until input is given.
        double first_number =  input_number1.nextDouble();
        // - Again, asking a prompt, waiting for input before continuing.
        System.out.print("Enter your second number that will be added: ");
        double second_number =  input_number1.nextDouble();

        // - Putting the total in a double variable which adds the two values together.
        double total =  second_number + first_number;

        // - Prints out the total answer.
        System.out.println("The total is: " + total);

        System.out.println(divider + " [BASIC CALCULATOR IN JAVA ⤴ ]");
        */

        // ————————————————————————————————————————————————————————
        // - MAD LIBS GAME
        // ————————————————————————————————————————————————————————

        /*
        // Created a new Scanner
        Scanner mad_libs = new Scanner(System.in);
        // User can answer first question. Also updating the color variable later on in the code.
        System.out.print("Enter in one color: ");
        String color1 =  mad_libs.nextLine().toLowerCase();
        // User can answer second question.
        System.out.print("Enter one plural noun: ");
        String plural_noun = mad_libs.nextLine();
        // User can answer third question.
        System.out.print("Enter a celebrity: ");
        String celebrity = mad_libs.nextLine();

        // Prints out the mad lib in the console along with the String variables.
        System.out.println("\nRoses are " + color1 + " \n" + plural_noun + " are blue \n" + "I love " + celebrity);

        System.out.println(divider + "[MAD LIBS GAME ⤴ ]");
        */

        // ————————————————————————————————————————————————————————
        // - ARRAYS IN JAVA
        // ————————————————————————————————————————————————————————

        // - Making a list of strings inside the friends variable.
        String [] friends = {"John", "Jim", "Bob"};
        // - Print out index position 0 of the string.
        System.out.println(friends[0]);
        // - Print out index position 1 of the string.
        System.out.println(friends[1]);
        // - Print out index position 2 of the string.
        System.out.println(friends[2]);
        // - Find out how many items are in the array.
        System.out.println(friends.length);
        // - Replacing index position 0 with another friend. ( Updating the variable )
        friends[0] = "Jake";
        System.out.println(friends[0]);
        // - Making an array with no values at the start.
        String [] friends2 = new String[3];
        // - Filling up index position 0 - 2 with items.
        friends2[0] = "Mark";
        friends2[1] = "Jacob";
        friends2[2] = "Sam";
        // - Printing out the 3 friends.
        System.out.println(friends2[0] + "\n" + friends2[1] + "\n" + friends2[2]);

        System.out.println(divider + " [ARRAYS IN JAVA ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - METHODS IN JAVA ( Also known as functions )
        // ————————————————————————————————————————————————————————


        // Calls the method and prints it out in the the file.
        SayHello();
        // Prints out the names, but you have to put in the String and Int you want to use inside the method.
        SayNames("John", 21);
        // Using a variable to print out the name and age from the Method.
        String mike = "Mike";
        int age = 24;

        SayNames(mike, age);

        System.out.println(divider + " [METHODS IN JAVA ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - RETURN STATEMENTS
        // ————————————————————————————————————————————————————————


        // - Printing out the Method to return a cubed number.
        System.out.println(cube(4));
        // - Using a int variable to print out the number that gets cubed.
        int cubed_number = 3;
        System.out.println(cube(cubed_number));
        // - You can also do Strings, Booleans, Ints, ect.
        // - Printing out a String from a method.
        System.out.println(text("This is a piece of text."));

        System.out.println(divider + " [RETURN STATEMENTS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - IF STATEMENTS
        // ————————————————————————————————————————————————————————


        // - Declaring a boolean variable called is_male which is set to true.
        // - Declaring another boolean variable called is_tall which is set to true.
        boolean is_male = true;
        boolean is_tall = true;

        // - Simple if statement that checks if is_male is true.
        if (is_male) {
            System.out.println("You are a male.");
        } else {
            System.out.println("You are not a male.");
        }

        // - If statement checking that one condition in is_male or is_tall is true, using the || operator.
        if (is_male || is_tall) {
            System.out.println("You are a male or tall, or both.");
        } else {
            System.out.println("You are not male, or tall.");
        }

        // - If statement checking that both conditions in is_male and is_tall are both true, using the && operator.
        if (is_male && is_tall) {
            System.out.println("You are a tall male.");
        } else {
            System.out.println("You are not tall, not male, or both.");
        }

        // - If statement with else if in it.
        if (is_male && is_tall) {
            System.out.println("You are a tall male.");
            // - Checks if is_male is true and is_tall is false. ! means not.
        } else if (is_male && !is_tall) {
            System.out.println("You are a short male.");
            // - Checks if is_male is false and is_tall is true.
        } else if (is_male && is_tall) {
            System.out.println("You are not a male, but your tall.");
            // - If all conditions don't match, then it will print out saying that your not male, and your not tall.
        } else {
            System.out.println("Your not a male, and your not tall.");
        }

        System.out.println(divider + " [IF STATEMENTS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - IF STATEMENTS & COMPARISONS
        // ————————————————————————————————————————————————————————


        // - Printing out the max_number method and passing in 3 numbers.
        System.out.println(max_number(2, 10, -14));

        System.out.println(divider +  " [IF STATEMENTS & COMPARISONS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - BUILDING A BETTER CALCULATOR
        // ————————————————————————————————————————————————————————


        /*
        // - Declaring a new scanner.
        Scanner calculator_input = new Scanner(System.in);

        // - First input to take in first number.
        System.out.print("Enter your first number: ");
        double num1 = calculator_input.nextDouble();

        // - Second input to take in a operator.
        // - .next() will take in the first character from the input and discard the rest.
        System.out.print("Enter an operator: ");
        String operator = calculator_input.next();

        // - Third input to take in another number.
        System.out.print("Enter your second number: ");
        double num2 = calculator_input.nextDouble();

        // - Starting off the if statement, checking if operator is equal to +
        if (operator.equals("+")) {
            System.out.println("\n" + num1 + num2);
            // - Checking if operator is equal to -
        } else if (operator.equals("-")) {
            System.out.print("\n");
            System.out.println(num1 - num2);
            // - Checking if operator is equal to *
        } else if (operator.equals("*")) {
            System.out.println("\n" + num1 * num2);
            // - Checking if operator is equal to /
        } else if (operator.equals("/")) {
            System.out.println("\n" + num1 / num2);
            // - If the operator is not equal to any of those, a message will be displayed.
        } else {
            System.out.println("Not a valid Operator ( +, -, *, /) Are Your Choices");
        }

        System.out.println(divider + " [BUILDING A BETTER CALCULATOR ⤴ ]");
        */

        // ————————————————————————————————————————————————————————
        // - SWITCH STATEMENTS
        // ————————————————————————————————————————————————————————


        // - Passing in the numbers 5 and 6 inside the method.
        System.out.println(get_day_name(5));
        System.out.println(get_day_name(6));
        // - This will use the default switch statement because none of the case's are checking number 10.
        System.out.println(get_day_name(10));

        System.out.println(divider + " [SWITCH STATEMENTS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - WHILE LOOPS
        // ————————————————————————————————————————————————————————


        // - Set a indexing variable to determine how many times the program goes through the while loop.
        int i = 1;

        // - Creating the while loop. Inside of the while loop there will be a condition you can compare or use.
        // - As long as that condition is true then the code will be executed over and over until the condition is false.
        while (i <= 10) {
            System.out.println(i); // - The variable i is equal to one. While i is less than or equal to 10, it will be printed out to the screen.
            i = i + 1; // - After each i is printed out, it will be added by 1 each time.
            // i++; - This also does the same thing too.
        }

        // - Updating the i variable in the code.
        i = 11;

        // - Creating a do loop. What happens in do loop is it runs the code first before it checks the condition.
        // - So i = 11, so that means it is greater than 10.
        // - In a while loop it would not print out i because while loops check conditions before they are ran.
        // - In a do loop it runs the code, then after it starts running it checks the condition.
        do {
            System.out.println("\n" + i); // - The variable i is going to be printed out.
            i = i + 1; // - Notice that the value gets added to 12, but does not get printed out.
                       // - This is because after it is ran it checks the condition and knows that i is greater or equal to 10.
        } while (i <= 10);

        System.out.println(divider + " [WHILE LOOPS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - GUESSING GAME
        // ————————————————————————————————————————————————————————

        /*
        // - Creating a new input.
        Scanner guessing_input = new Scanner(System.in);

        String secret_word = "dog"; // - Creating the secret word called dog.
        String guess = ""; // - Setting the guess to a empty String.
        int guess_count = 0; // - Setting the guess count to 0. This will be added later though.
        int guess_limit = 3; // - Setting the guess limit to 3
        boolean out_of_guesses = false; // - Setting out of guesses to false.

        // - Creating a while loop that cheeks that if the guess is not equal to the secret word
        // - It also checks to see if the out_of_guesses variable is not true.
        while (!guess.equals(secret_word) && !out_of_guesses) {
            // - Checking if the guess count is less than the guess limit.
            if (guess_count < guess_limit) {
                System.out.print("Enter the secret word: "); // - Printing out a message
                guess = guessing_input.nextLine(); // - Saving the guess variable
                guess_count++; // - Adding 1 to the guess count variable.
            } else {
                out_of_guesses = true; // - Other wise if the user uses all guesses, the variable out_of_guesses will be set to true.
            }
        }

        // - Checking if the user is out of guesses.
        if (out_of_guesses) {
            System.out.println("\nYou ran out of guesses! The secret word was dog.");
        } // - Else the user wins and has not used all guesses.
        else {
            System.out.println("\nYou won! The secret word was dog.");
        }

        System.out.println(divider + "[GUESSING GAME ⤴ ]");
        */

        // ————————————————————————————————————————————————————————
        // - FOR LOOPS
        // ————————————————————————————————————————————————————————


        // - Almost the same as a while loop, but you can put the indexing variable inside the loop.
        // - We are declaring an int called "in" inside the for loop.
        // - After that we are comparing in <= 10 which will print out "in" 10 times.
        // - Then "in" will be added 1 time, each time the for loop runs.
        for (int in = 1; in <= 10; in++) {
            System.out.println(in); // - Printing out "in" each time.
        }

        // - Creating an Array of names
        String [] names = {"John", "Oscar", "Jim"};

        // - Making another for loop that will print out each name in the array.
        for (int n = 0; n < names.length; n++) {
            System.out.println(names[n]); // - Printing out each name.
        }

        // - Simple method by using a foreach loop to print each name in the array.
        for (String s : names) {
            System.out.println(s); // - Printing out each name.
        }

        System.out.println(divider + " [FOR LOOPS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - MAKING AN EXPONENT METHOD
        // ————————————————————————————————————————————————————————


        // - Building a method that will do the exact same thing as this.
        System.out.println(Math.pow(3, 2));
        // - Using the method and getting the answer 9.
        System.out.println(pow(3, 2));

        System.out.println(divider + " [MAKING AN EXPONENT METHOD ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - NESTED LOOPS & 2D ARRAYS
        // ————————————————————————————————————————————————————————


        // - Creating a 2D array. A 2D array is an array that has more than one array inside of it. You can access these with index positions
        int [][] number_grid = {
                {1, 2, 3}, // - Array 1 - Index position 0
                {4, 5, 6}, // - Array 2 - Index position 1
                {7, 8, 9}, // - Array 3 - Index position 2
                {0} // - Array 4 - Index position 3
        };

        // - Printing out an array inside the 2D array with values inside of it.
        // - First you use the array index position then, index position for the numnber inside the array
        System.out.println(number_grid[0][0]);
        // - Printing out the number 9
        System.out.println(number_grid[2][2]);

        // - Adding a space inside the console.
        System.out.println();

        // - Creating out first nested loop. For every iteration of the top loop, the bottom loop will be fully completed.
        for (int x = 1; x < 3; x++) {
            for (int y = 1; y < 4; y++) {
                System.out.println("x = " + x + ", y = " + y);
            }
        }

        // - Adding a space inside the console.
        System.out.println();

        // - This for loop will loop through each array and each element inside those arrays.
        for (int x = 0; x < number_grid.length; x++) {
            for (int y = 0; y < number_grid[x].length; y++) {
                System.out.print(number_grid[x][y]); // - Printing out the array and the values inside them.
            }
            System.out.println(); // - Adding a space to make the output inside the console look better.
        }

        // - Using a for each loop which does the same thing
        for (int[] ints : number_grid) {
            for (int anInt : ints) {
                System.out.print(anInt); // - Printing out the array and the values inside them.
            }
            System.out.println(); // - Adding a space to make the output inside the console look better.
        }

        System.out.println(divider + " [NESTED LOOPS & 2D ARRAYS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - TRY / CATCH & EXCEPTIONS
        // ————————————————————————————————————————————————————————

        /*
        // - Creating a user input to enter a number.
        Scanner number_input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // - Creating an array of numbers
        int [] array_numbers = {1, 2, 3};

        // - Attempting to get user input with a number and print out an
        try {
            // - Saving input to a double variable.
            double number3 = number_input.nextDouble();
            // - Printing out the number.
            System.out.println("Number is: " + number3);

            // - Attempting to print out a number inside the array that is not in an index position
            System.out.println(array_numbers[4]);
        // - Trying to catch an Array Index error.
        } catch (ArrayIndexOutOfBoundsException e) {
            // - Telling the user the array is out of bounds.
            System.out.println("The array index position is out of bounds. Error: " + e);
        // - Trying to catch a Input error if the user does not put a number.
        } catch (InputMismatchException e) {
            // - Telling the user to enter a number, along with printing out the error.
            System.out.println("Please enter a number. Error: " + e);
        // - Catching any other unknown exceptions that could happen
        } catch (Exception e) {
            // - Printing out the unknown error.
            System.out.println("Unknown exception has occurred: " + e);
        }

        System.out.println(divider + " [TRY / CATCH & EXCEPTIONS ⤴ ]");
       */

        // ————————————————————————————————————————————————————————
        // - CLASSES & OBJECTS
        // ————————————————————————————————————————————————————————



        // - Creating a student object.
        Student student = new Student();

        // - Filling in these attributes for a student.
        student.first_name = "Jim";
        student.last_name = "Halpert";
        student.major = "Business";
        student.gpa = 2.3;
        student.age = 24;
        student.on_probation = false;

        // - Printing out some of the attributes for a student.
        System.out.println("Student first name: " + student.first_name +
                           "\nStudent last name: " + student.last_name +
                           "\nStudent GPA: " + student.gpa +
                           "\nStudent age: " + student.age);


        // - Creating another student object.
        Student student2 = new Student();

        // - Filling in these attributes for another student.
        student2.first_name = "Pam";
        student2.last_name = "Beasley";
        student2.major = "Art";
        student2.gpa = 2.5;
        student2.age = 23;
        student2.on_probation = true;

        // - Printing out some of the attributes for student2.
        System.out.println("\nStudent first name: " + student2.first_name +
                        "\nStudent last name: " + student2.last_name +
                        "\nStudent GPA: " + student2.gpa +
                        "\nStudent age: " + student2.age);

        System.out.println(divider + " [CLASSES & OBJECTS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - CONSTRUCTORS
        // ————————————————————————————————————————————————————————


        // - Creating a book object while passing in all attributes for a book.
        Book book = new Book("Dog", "John Doe", 52, "English");

        // - Printing out some of the attributes for a book.
        System.out.println("Book title: " + book.title +
                        "\nAuthor: " + book.author +
                        "\nPages: " + book.pages +
                        "\nLanguage: " + book.language);

        System.out.println(divider + " [CONSTRUCTORS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - OBJECT & INSTANCE METHODS
        // ————————————————————————————————————————————————————————


        // - Creating a student3 object with name, major, and gpa.
        Student_And_Honor_Roll student3 = new Student_And_Honor_Roll("Mike", "Computer Science", 3.7);

        // - Printing out some of the attributes while using a method that checks if student is on honor roll.
        System.out.println("First name: " + student3.first_name +
                        "\nMajor: " + student3.major +
                        "\nOn Honor Roll?: " + student3.check_on_honor_roll());

        System.out.println(divider + " [OBJECT & INSTANCE METHODS ⤴ ]");


        // ————————————————————————————————————————————————————————
        // - GETTERS & SETTERS
        // ————————————————————————————————————————————————————————


        // - Creating a movie object.
        Movie movie1 = new Movie("The avengers", "Joss Whedon", "PG-13");

        // - Printing out the title, director, and rating using out getter method.
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getRating());

        // - Setting movie 1 to a invalid movie rating.
        movie1.setRating("dog");
        // - Printing out the rating, which will display NR.
        System.out.println(movie1.getRating());

        // - Setting movie 1 to a valid rating.
        movie1.setRating("PG");
        // - Printing out the valid rating.
        System.out.println(movie1.getRating());

        System.out.println(divider + " [GETTERS & SETTERS ⤴]");


        // ————————————————————————————————————————————————————————
        // - STATIC CLASS ATTRIBUTES
        // ————————————————————————————————————————————————————————

        // - Creating a new song object.
        Song ransom = new Song("Ransom", "Lil Tecca", 212);
        // - Creating another song object.
        Song rolling_loud = new Song("Rolling Loud", "YNW Melly", 203);

        // - Printing out Ransom song title.
        System.out.println(ransom.getTitle());
        // - Printing out the Rolling loud song title.
        System.out.println(rolling_loud.getTitle());

        // - Printing out the current amount of songs from both objects.
        System.out.println("Amount of songs: " + ransom.getSongsCount());
        System.out.println("Amount of songs: " + rolling_loud.getSongsCount());

        System.out.println(divider + " [STATIC CLASS ATTRIBUTES ⤴]");


        // ————————————————————————————————————————————————————————
        // - STATIC CLASS METHODS
        // ————————————————————————————————————————————————————————


        // - Creating a new object of the Prints class to call a SayGoodbye method.
        Prints printing = new Prints();
        printing.sayGoodbye();

        // - Calling the static class method without creating another instance of the class.
        Prints.sayGoodbye();
        // - Printing out how many feet are in one mile.
        System.out.println("1 mile to feet: " + Prints.feetInMile);

        System.out.println(divider + " [STATIC CLASS METHODS ⤴]");


        // ————————————————————————————————————————————————————————
        // - INHERITANCE (EXTENDS)
        // ————————————————————————————————————————————————————————


        // - Creating a new object of the chef class.
        Chef regularChef = new Chef();
        // - Calling the makeChicken method for the regular chef.
        regularChef.makeChicken();
        // - Calling the makeSalad method for the regular chef.
        regularChef.makeSalad();
        // - Calling the makeSpecialDish method for the regular chef.
        regularChef.makeSpecialDish();

        System.out.println(); // - Adding 1 line spacing

        // - Creating a new object of the ItalianChef class.
        ItalianChef italianChef = new ItalianChef();
        // - Calling the makeSpecialDish method for the italian chef.
        italianChef.makeSpecialDish();
        // - Calling the makePasta method for the italian chef.
        italianChef.makePasta();

        System.out.println(); // - Adding 1 line spacing

        // - Creating a new object of the ChineseChef class.
        ChineseChef chineseChef = new ChineseChef();
        // - Calling the makeSpecialDish method for the chinese chef.
        chineseChef.makeSpecialDish();
        // - Calling the makeFriedRice method for the chinese chef.
        chineseChef.makeFriedRice();

        System.out.println(); // - Adding 1 line spacing

        // - Calling the makeSalad method for the chinese chef.
        chineseChef.makeSalad();
        // - Calling the makeChicken method for the chinese chef.
        chineseChef.makeChicken();

        System.out.println(divider + " [INHERITANCE (EXTENDS) ⤴]");


        // ————————————————————————————————————————————————————————
        // - INTERFACE INHERITANCE (IMPLEMENTS)
        // ————————————————————————————————————————————————————————


        // - Creating an instance of the Dog class with the Animal interface.
        Animal dog = new Dog();
        dog.eat();

        // - Creating an instance of the cow class with the Animal interface.
        Animal cow = new Cow();
        cow.eat();

        System.out.println(); // - Adding 1 line spacing

        // - Creating an array of different classes from the animal interface.
        Animal [] animals = {
                new Dog(),
                new Cow(),
        };

        // - Creating a for each loop that goes through each class and printing out the eat method.
        for (Animal a : animals) {
            a.speak();
        }

        System.out.println(divider + " [INTERFACE INHERITANCE (IMPLEMENTS) ⤴]");


        // ————————————————————————————————————————————————————————
        // - MAIN METHODS & NON STATIC METHODS
        // ————————————————————————————————————————————————————————


        // - Creating an object of the Main class inside our Main.java file to create a non-static method.
        Main main = new Main();
        // - Calling the non-static method.
        main.sayHi();

        System.out.println(divider + " [MAIN METHODS & NON STATIC METHODS ⤴]");


        // ————————————————————————————————————————————————————————
        // - IMPORTS & PACKAGES
        // ————————————————————————————————————————————————————————


        // - Creating a new object of the SampleClassOne from package_one.
        // - This package had to imported at the top of the file before it can be used.
        SampleClassOne sampleClassOne = new SampleClassOne();

        // - Creating another new object of the SampleClassTwo
        SampleClassTwo sampleClassTwo = new SampleClassTwo();

        // - Calling the method inside of the sampleClassOne.
        sampleClassOne.tellFromPackageOne();
        // - Calling the method inside of the sampleClassTwo.
        sampleClassTwo.tellFromPackageTwo();

        System.out.println(divider + " [IMPORTS AND PACKAGES] ⤴]");


        // ————————————————————————————————————————————————————————
        // - ACCESS MODIFIERS
        // ————————————————————————————————————————————————————————


        // - Creating a new object of the modifiers class located in package_modifiers
        Modifiers modifiers = new Modifiers("I am a public string variable.",
                                            "I am a private string variable.",
                                            "I am a protected string variable.");

        // - Accessing the public string directly without using a getter because its public.
        System.out.println(modifiers.publicString);
        // - Accessing the private string using a getter. (You can not directly access the variable because it is private)
        System.out.println(modifiers.getPrivateString());
        // - Accessing the protected string using a getter.
        // - This is possible because the getter is public and is returning the protected variable string inside the method.
        System.out.println(modifiers.getProtectedString());

        System.out.println(divider + " [ACCESS MODIFIERS ⤴]");
    }


    // ————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    // ————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    // ————————————————————————————————————————————————————————————————————————————————————————————————————————————————
    // ————————————————————————————————————————————————————————————————————————————————————————————————————————————————


    // ————————————————————————————————————————————————————————
    // - METHODS IN JAVA ( Also known as functions )
    // ————————————————————————————————————————————————————————


    // - Creating a method with no parameters.
    public static void SayHello() {
        System.out.println("Hello user!");
    }

    // - Creating a method with a String parameter and an age parameter.
    public static void SayNames(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age);
    }


    // ————————————————————————————————————————————————————————
    // - RETURN STATEMENTS
    // ————————————————————————————————————————————————————————


    // - Creating a method that has a return statement that will cube the number.
    // - If you want the method to return something, you have to declare what kind of method it is.
    // - For example if your returning a int number, you have to make the method a int.
    // - If your returning a string you have to make the method a String.
    public static int cube(int NumberToCube) {
        return NumberToCube * NumberToCube * NumberToCube;
        // - You cannot write code under the return statement as it will not be ran.
        // - After the return statement is ran the method will be done executing.
    }

    // - Creating another method that returns a string
    public static String text(String value) {
        return value;
    }


    // ————————————————————————————————————————————————————————
    // - IF STATEMENTS & COMPARISONS
    // ————————————————————————————————————————————————————————


    // - >= is a comparison operator, this is how we compare the two data types.
    // - You can compare booleans, strings, numbers, ect, with a comparison operator.
    // - >, <, !=, >=, <=, ==. Those are some of the Most common comparison operators.

    // - > Greater than.
    // - < Less than.
    // - != Not equal to.
    // - >= Greater than or equal to.
    // - <= Less than or equal to.
    // - == Equal to.

    // - Creating a method that finds the biggest number and returns it.
    public static int max_number(int number1, int number2, int number3) {
        // - Checking if number1 is greater or equal to number2 and number3.
        if (number1 >= number2 && number1 >= number3) {
            return number1;
            // - Checking if number2 is greater or equal to number1 and number3.
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
            // - Other wise, returning number3 as the biggest value.
        } else {
            return number3;
        }
    }


    // ————————————————————————————————————————————————————————
    // - SWITCH STATEMENTS
    // ————————————————————————————————————————————————————————


    // - Creating a new method that compares a number to a day of the week.
    public static String get_day_name(int day_number)  {
        // - Setting dayname to equal a empty string/
        String dayname = "";
        // - Comparing day_number to different numbers which will then assign dayname to a name inside of the String.
        switch (day_number) {
            // - Case 0 will compare day_number to the number 0, if the number 0 is passed in the method dayname will be assigned Sunday.
            case 0:
                dayname = "Sunday";
                // - Break means to end or stop the first case from the switch.
                break;
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            // - If none of the conditions are true, default inside of the switch will be used instead.
            default:
                dayname = "Invalid Day Number";
        }

        // - Returning the value of dayname after the switch.
        return dayname;
    }


    // ————————————————————————————————————————————————————————
    // - MAKING AN EXPONENT METHOD
    // ————————————————————————————————————————————————————————


    // - Creating a method that will multiply the base number and power number.
    public static int pow(int basenumber, int powernumber) {
        int result = 1; // - Setting result variable equal to 1.

        // - Creating a for loop that will loop through it however big the power number is.
        // - If the power number was 5 it would go through this loop 5 times.
        for (int i = 0; i < powernumber; i++) {
            result = result * basenumber; // - Taking the result and multiplying it by the base number.
        }
        return result; // - Returning the result variable after the for loop is done.
    }


    // ————————————————————————————————————————————————————————
    // - MAIN METHODS & NON STATIC METHODS
    // ————————————————————————————————————————————————————————
    
    
    // - Creating a non-static method that we can use inside our of main method inside the Main class.
    public void sayHi() {
        System.out.println("Hello!");
    }
}
