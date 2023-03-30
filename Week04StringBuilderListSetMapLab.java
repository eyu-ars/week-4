//
// Author: eyusias
// Subject: StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List; 
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

  public static void main(String[] args) {

    // 1. Why would we use a StringBuilder instead of a String?
    // a. Instantiate a new StringBuilder
    // b. Append the characters 0 through 9 to it separated by dashes
    // Note: make sure no dash appears at the end of the StringBuilder

    System.out.println("Q1. Why would we use a StringBuilder instead of a String?\n");
    System.out.println("ANS: \n");

    System.out.println("Q1.a Instantiate a new StringBuilder\n");
    StringBuilder sb = new StringBuilder();

    System.out.println("Q1.b Append the characters 0 through 9 to it separated by dashes "
        + "\nNote:  make sure no dash appears at the end of the StringBuilder \n");

    for (int index = 0; index < 10; index++) {
      if (index == 9)
        sb.append(index);
      else
        sb.append(index + "-");
    }
    System.out.println(sb.toString());



    // 2. List of String:
    // a. Create a list of Strings
    // b. Add 5 Strings to it, each with a different length

    System.out.println("\nQ2. List of String: " + "\n a. Create a list of Strings "
        + "\n b. Add 5 Strings to it, each with a different length \n");

    List<String> strList = new ArrayList<String>();
    strList.add("Bob");
    strList.add("Smith");
    strList.add("Jo");
    strList.add("John");
    strList.add("Alexunder");

    System.out.println(strList.toString());



    // 3. Write and test a method that takes a list of strings
    // and returns the shortest string
    System.out.println(
        "\nQ3. Write and test a method that takes a list of strings and returns the shortest string \n");
    System.out.println("The smallest string is:\n " + returnSmallestString(strList));



    // 4. Write and test a method that takes a list of strings
    // and returns the list with the first and last element switched
    System.out.println(
        "\nQ4. Write and test a method that takes a list of strings and returns the list with the first and last element switched\n");
    System.out.println("After first and last element is exchanged:\n "
        + returnFirstAndLastExchangedElement(strList));



    // 5. Write and test a method that takes a list of strings
    // and returns a string with all the list elements concatenated to each other,
    // separated by a comma
    System.out.println(
        "\nQ5. Write and test a method that takes a list of strings and returns a string with "
            + "\n all the list elements concatenated to each other, separated by a comma\n");
    System.out.println("After list element concatination:\n " + returnConcatinatedString(strList));



    // 6. Write and test a method that takes a list of strings and a string
    // and returns a new list with all strings from the original list
    // containing the second string parameter (i.e. like a search method)
    System.out.println(
        "\nQ6. Write and test a method that takes a list of strings and a string and returns a new list with all strings"
            + "\n from the original list containing the second string parameter (i.e. like a search method)\n");
    System.out.println("New list element:\n " + checkStringSequence(strList, "Jo"));



    // 7. Write and test a method that takes a list of integers
    // and returns a List<List<Integer>> with the following conditions specified
    // for the return value:
    // a. The first List in the returned value contains any number from the input list
    // that is divisible by 2
    // b. The second List contains values from the input list that are divisible by 3
    // c. The third containing values divisible by 5, and
    // d. The fourth all numbers from the input List not divisible by 2, 3, or 5
    System.out.println(
        "\nQ7. Write and test a method that takes a list of integers and returns a List<List<Integer>> with the following "
            + "\n conditions specified for the return value: "
            + "\n a. The first List in the returned value contains any number from the input list that is divisible by 2"
            + "\n b. The second List contains values from the input list that are divisible by 3"
            + "\n c. The third containing values divisible by 5, and"
            + "\n d. The fourth all numbers from the input List not divisible by 2, 3, or 5 \n");
    List<Integer> intList = new ArrayList<Integer>();
    intList.add(15);
    intList.add(4);
    intList.add(6);
    intList.add(30);
    intList.add(17);
    intList.add(23);
    intList.add(5);
    intList.add(9);
    intList.add(77);
    System.out.println("Orginal list :\n " + intList);

    System.out.println("\nNew list collection divisible by 2, 3, 5, and note div By 2,3,5 :\n "
        + getListOfIntByDivisible(intList));



    // 8. Write and test a method that takes a list of strings
    // and returns a list of integers that contains the length of each string
    System.out.println("\nQ8. Write and test a method that takes a list of strings and returns"
        + "\n a list of integers that contains the length of each string\n");
    System.out.println("Length of each element list:\n " + getEachStringLength(strList));



    // 9. Create a set of strings and add 5 values
    System.out.println("\nQ9. Create a set of strings and add 5 val \n");

    Set<String> strSet = new HashSet<String>();
    strSet.add("Nevada");
    strSet.add("Utah");
    strSet.add("Arizona");
    strSet.add("California");
    strSet.add("New Mexico");

    System.out.println(strSet.toString());



    // 10. Write and test a method that takes a set of strings and a character
    // and returns a set of strings consisting of all the strings in the
    // input set that start with the character parameter.
    System.out.println(
        "\nQ10. Write and test a method that takes a set of strings and a character and returns a set of  "
            + "\n strings consisting of all the strings in the input set that start with the character parameter.\n");
    System.out.println("Each set element: \n " + checkStringStartingCharacter(strSet, 'N'));



    // 11. Write and test a method that takes a set of strings
    // and returns a list of the same strings
    System.out.println(
        "\nQ11. Write and test a method that takes a set of strings and returns a list of the same strings.\n");
    System.out.println("From set of string to list of string: \n " + fromSetToList(strSet));



    // 12. Write and test a method that takes a set of integers
    // and returns a new set of integers containing only even numbers
    // from the original set
    System.out.println(
        "\nQ12. Write and test a method that takes a set of integers and returns a new set of "
            + "\n integers containing only even numbers from the original set.\n");
    
    Set<Integer> intSet = new HashSet<Integer>();
    for(int i = 1; i <= 10; i++)
      intSet.add(i);
    System.out.println("Orginal set:\n " + intSet);
    System.out.println("\nSet of even integers: \n " + getEvenElements(intSet));



    // 13. Create a map of string and string and add 3 items to it where the key of each
    // is a word and the value is the definition of the word
    System.out.println(
        "\nQ13. Create a map of string and string and add 3 items to it where the key of each  "
            + "\n is a word and the value is the definition of the word.\n");
    
    Map<String, String> wordDefination = new HashMap<String, String>();
    
    wordDefination.put("sad", "feeling or showing sorrow.");
    wordDefination.put("happy", "feeling or showing pleasure or contentment.");
    wordDefination.put("tired", "in need of sleep or rest; weary.");
    
    System.out.println(wordDefination.toString());



    // 14. Write and test a method that takes a Map<String, String> and a string
    // and returns the value for a key in the map that matches the
    // string parameter (i.e. like a language dictionary lookup)
    System.out.println(
        "\nQ14. Write and test a method that takes a Map<String, String> and a string and returns the value for "
            + "\n a key in the map that matches the string parameter (i.e. like a language dictionary lookup).\n");
    
    String key = "tired";
    System.out.println("The meaning of word " + key + " is: \n" + getValueFromMap(wordDefination, key));



    // 15. Write and test a method that takes a List<String>
    // and returns a Map<Character, Integer> containing a count of
    // all the strings that start with a given character
    System.out.println(
        "\nQ15. Write and test a method that takes a List<String> and returns a Map<Character, Integer>"
            + "\n containing a count of all the strings that start with a given character.\n");
    
    System.out.println("Orginal list :\n " + strList);

    System.out.println("\nNew Map<Character, Integer> based on string initial character:\n "
        + getMapFromStringList(strList));

  }

  

  // Method 15:
  public static Map<Character, Integer> getMapFromStringList(List<String> strList) {
    
    if(!strList.isEmpty()) {
      
      Map<Character, Integer> build = new HashMap<Character, Integer>();
      char startingChar = '\u0000';
      for(String eachStr : strList) {
        startingChar = eachStr.charAt(0);
        if(build.containsKey(startingChar)) {
          build.replace(startingChar, (build.get(startingChar).intValue() + 1));
        }else {
          build.put(startingChar, 1);
        }
        
      }
      
      return build;
    }        
    
    return null;
    
  }



  // Method 14:
  public static String getValueFromMap(Map<String, String> map, String str) {
    
    if(!map.isEmpty() && map.get(str) != null) {
      return map.get(str);
    }
    
    return null;
  }



  // Method 12:
  public static Set<Integer> getEvenElements(Set<Integer> intSet) {

    if (!intSet.isEmpty()) {
      Set<Integer> buildEvenSet = new HashSet<Integer>();
      for (int value : intSet)
        if (value % 2 == 0)
          buildEvenSet.add(value);

      return buildEvenSet;
    }

    return null;
  }



  // Method 11:
  public static List<String> fromSetToList(Set<String> strSet) {

    List<String> tempStringList = new ArrayList<String>();

    if (!strSet.isEmpty()) {
      for (String value : strSet)
        tempStringList.add(value);
    }

    return tempStringList;
  }



  // Method 10:
  public static Set<String> checkStringStartingCharacter(Set<String> strSet, char startingChar) {

    Set<String> tempStringSet = new HashSet<String>();

    if (!strSet.isEmpty()) {

      String upperCase = null;
      String lowerCase = null;

      for (String value : strSet) {
        upperCase = value.toUpperCase();
        lowerCase = value.toLowerCase();
        // if ((upperCase.startsWith(value.valueOf(startingChar))) ||
        // (lowerCase.startsWith(value.valueOf(startingChar)))) {
        if ((upperCase.charAt(0) == startingChar) || (lowerCase.charAt(0) == startingChar)) {
          tempStringSet.add(value);
        }
      }
    }

    return tempStringSet;
  }



  // Method 8:
  public static List<Integer> getEachStringLength(List<String> strList) {

    List<Integer> tempIntList = new ArrayList<Integer>();

    if (!strList.isEmpty()) {

      for (int index = 0; index < strList.size(); index++)
        tempIntList.add(strList.get(index).length());

    }

    return tempIntList;
  }



  // a. The first List in the returned value contains any number from the input list
  // that is divisible by 2
  // b. The second List contains values from the input list that are divisible by 3
  // c. The third containing values divisible by 5, and
  // d. The fourth all numbers from the input List not divisible by 2, 3, or 5

  // Method 7:
  public static List<List<Integer>> getListOfIntByDivisible(List<Integer> intList) {

    List<Integer> divisibleBy_2 = new ArrayList<Integer>();
    List<Integer> divisibleBy_3 = new ArrayList<Integer>();
    List<Integer> divisibleBy_5 = new ArrayList<Integer>();
    List<Integer> notDivisibleBy_2_3_5 = new ArrayList<Integer>();

    List<List<Integer>> collectionOfList = new ArrayList<List<Integer>>();

    if (!intList.isEmpty()) {

      for (int index = 0; index < intList.size(); index++) {
        if (!(intList.get(index) % 2 == 0) && !(intList.get(index) % 3 == 0)
            && !(intList.get(index) % 5 == 0)) {

          notDivisibleBy_2_3_5.add(intList.get(index));

        } else {
          if (intList.get(index) % 2 == 0)
            divisibleBy_2.add(intList.get(index));
          if (intList.get(index) % 3 == 0)
            divisibleBy_3.add(intList.get(index));
          if (intList.get(index) % 5 == 0)
            divisibleBy_5.add(intList.get(index));
        }
      }
      collectionOfList.add(divisibleBy_2);
      collectionOfList.add(divisibleBy_3);
      collectionOfList.add(divisibleBy_5);
      collectionOfList.add(notDivisibleBy_2_3_5);

    }

    return collectionOfList;
  }


  // Method 6:
  public static List<String> checkStringSequence(List<String> strList, String str) {

    List<String> tempStringList = new ArrayList<String>();

    if (!strList.isEmpty()) {

      for (int index = 0; index < strList.size(); index++) {

        if (strList.get(index).contains(str)) {

          tempStringList.add(strList.get(index).toString());
        }
      }
    }

    return tempStringList;
  }


  // Method 5:
  public static String returnConcatinatedString(List<String> strList) {

    StringBuilder sb = new StringBuilder();

    if (!strList.isEmpty()) {
      int size = strList.size();
      for (int index = 0; index < size; index++) {
        if (index == (size - 1))
          sb.append(strList.get(index).toString());
        else
          sb.append(strList.get(index).toString() + ",");
      }
    }
    return sb.toString();
  }


  // Method 4:
  public static List<String> returnFirstAndLastExchangedElement(List<String> strList) {

    if (!strList.isEmpty()) {
      String tempString = strList.get(strList.size() - 1).toString();
      strList.set((strList.size() - 1), strList.get(0));
      strList.set(0, tempString);

    }
    return strList;
  }


  // Method 3:
  public static String returnSmallestString(List<String> strList) {

    String smallestString = null;
    if (!strList.isEmpty()) {
      smallestString = strList.get(0).toString();
      for (String value : strList) {
        if (smallestString.length() > value.length())
          smallestString = value;
      }
    }
    return smallestString;
  }

}
