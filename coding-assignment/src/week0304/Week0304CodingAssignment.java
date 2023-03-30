//
// Author: eyusias
// Subject: Lists, Sets, & Maps
// Java Week 03/04 Coding Ass.
//

package week0304;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week0304CodingAssignment {

  public static void main(String[] args) {


    // Create an array
    int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};


    System.out.println(
        "Q1. a. Programmatically subtract the value of the first element in the array from the"
            + "\n value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. \n");
    System.out.println(ages[ages.length - 1] - ages[0]);



    System.out.println(
        "\n\n Q1. b. Add a new age to your array and repeat the step above to ensure it is "
            + "\n dynamic (works for arrays of different lengths) \n");

    // Creating "ages" array new instance because array size can't be changed after initialized
    // Array constants can only be used in initializers
    ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 50};
    System.out.println(ages[ages.length - 1] - ages[0]);
    


    System.out.println(
        "\n\n Q1. c. Use a loop to iterate through the array and calculate the average age. Print the result to the console  \n");
    NumberFormat formatter = new DecimalFormat("#0.0");
    double averageAge = 0;

    for (int element : ages)
      averageAge += element;
    averageAge = averageAge / ages.length;
    System.out.print("Array average age is: " + formatter.format(averageAge));
    System.out.println("\n");


    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    System.out
        .println("\n\n Q2.a.  Use a loop to iterate through the array and calculate the  "
            + "\n average number of letters per name. Print the result to the console \n");

    int totalLetterCount = 0;
    for (String name : names)
      totalLetterCount += name.length();
    System.out.println(totalLetterCount / names.length);



    System.out.println(
        "\n\n Q2.b. Use a loop to iterate through the array again and concatenate all the names "
            + "\n together, separated by spaces, and print the result to the console. \n");

    for (String name : names)
      System.out.print(name + " ");
    System.out.println("\n");



    System.out.println("\n\n Q3. How do you access the last element of any array?  \n");
    System.out.println("Accessing last element of array \"names\" using names[names.length-1]: "
        + names[names.length - 1]);



    System.out.println("\n\n Q4. How do you access the first element of any array?  \n");
    System.out.println("Accessing first element of array \"names\" using names[0]: " + names[0]);



    System.out.println(
        "\n\n Q5. Create a new array of int called nameLengths. Write a loop to iterate over "
            + "\n the previously created names array and add the length of each name to the nameLengths array \n");
    int[] nameLengths = new int[names.length];

    for (int i = 0; i < names.length; i++)
      nameLengths[i] = names[i].length();

    for (int eachNameLength : nameLengths)
      System.out.print(eachNameLength + " ");
    System.out.println("\n");



    System.out.println(
        "\n\n Q6. Write a loop to iterate over the nameLengths array and calculate the sum of all the"
            + "\n elements in the array. Print the result to the console \n");

    int sum = 0;
    for (int i = 0; i < nameLengths.length; i++)
      sum += nameLengths[i];
    System.out.println("Sum: " + sum);



    System.out.println(
        "\n\n Q7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated"
            + "\n to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”) \n");

    String concatenatedWord = wordConcat("Nevada", 5);
    System.out.println(concatenatedWord);



    System.out.println(
        "\n\n Q8. Write a method that takes two Strings, firstName and lastName, and returns a full name "
            + "\n (the full name should be the first and the last name as a String separated by a space). \n");

    String fullName = returnFullName("John", "Smith");
    System.out.println(fullName);



    System.out.println("\n\n Q9. Write a method that takes an array of int and returns true  "
        + "\n if the sum of all the ints in the array is greater than 100 \n");

    int[] intArray = {50, 45, 20};
    System.out.println(isArraySumGreaterthan100(intArray));



    System.out.println(
        "\n\n Q10. Write a method that takes an array of double and  returns the average of "
            + "\n all the elements in the array \n");

    double[] doubleArray = {15.5, 4.5, 2.2};
    double average = returnAverage(doubleArray);
    NumberFormat formatter2 = new DecimalFormat("#0.00");
    System.out.println(formatter2.format(average));
    System.out.println("\n");



    System.out.println(
        "\n\n Q11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array"
            + "\n array is greater than the average of the elements in the second array. \n");

    double[] doubleArray1 = {100.5, 4.5, 2.2};
    double[] doubleArray2 = {15.5, 4.5, 2.2};
    System.out.println(isAvgOfArray1GreaterthanAvgOfArray2(doubleArray1, doubleArray2));

    

    System.out.println(
        "\n\n Q12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and"
            + "\n returns true if it is hot outside and if moneyInPocket is greater than 10.50 \n");

    System.out.println(willBuyDrink(true, 11));    
    
    
    
    System.out.println(
        "\n\n Q13. Create a method of your own that solves a problem. In comments, "
            + "\n write what the method does and why you created it. \n");
    
    
    System.out.println("I created a method that validates name. Name should be letters only.\n");
    
    System.out.println(isValidName("Alex"));
    
    
  }



  // Q.7
  public static String wordConcat(String word, int number) {

    String tempWord = "";
    if (number > 0)
      for (int i = 0; i < number; i++)
        tempWord = (tempWord + word);
    else
      tempWord = "Number must be posetive.";
    return tempWord;
  }


  // Q.8
  public static String returnFullName(String firstName, String lastName) {

    if (firstName != null && lastName != null)
      return firstName + " " + lastName;
    else
      return "First name & Last name can't be Null";
  }



  // Q.9
  public static boolean isArraySumGreaterthan100(int[] listOfNumbers) {

    int sum = 0;
    for (int number : listOfNumbers)
      sum += number;
    if (sum > 100)
      return true;

    return false;
  }


  // Q.10
  public static double returnAverage(double[] doubleArray) {

    double sum = 0.0;
    for (double number : doubleArray)
      sum += number;

    return sum / doubleArray.length;
  }


  // Q.11
  public static boolean isAvgOfArray1GreaterthanAvgOfArray2(double[] doubleArray1,
      double[] doubleArray2) {

    double avgOfArray1 = 0.0;
    double avgOfArray2 = 0.0;

    for (double number : doubleArray1)
      avgOfArray1 += number;

    for (double number : doubleArray2)
      avgOfArray2 += number;

    avgOfArray1 = avgOfArray1 / doubleArray1.length;
    avgOfArray2 = avgOfArray2 / doubleArray2.length;

    System.out.println("Average of Array one: " + avgOfArray1);
    System.out.println("Average of Array two: " + avgOfArray2 + "\n");

    if (avgOfArray1 > avgOfArray2)
      return true;

    return false;
  }


  // Q.12
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    
    if((isHotOutside == true) && (moneyInPocket > 10.50))
        return true;
    return false;
  }
  
  
  // Q. 13
  /**
   * A method that checks a given string is valid name.
   * @param name accepting a String value
   * @return a boolean, true if it is a valid name, false otherwise
   */
  public static boolean isValidName(String name) {
    
    
    Pattern namePattern = Pattern.compile("[a-zA-Z][a-zA-Z]*");
    Matcher matcher = namePattern.matcher(name);
    
    return matcher.matches();
    
  }
}
