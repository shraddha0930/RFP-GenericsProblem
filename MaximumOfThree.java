package assignments.GenericsProblem;

import java.util.Scanner;

public class MaximumOfThree {
    static Integer firstNumber = 15 ,secondNumber = 20 , thirdNumber = 10;
    static Float firstNum = 10.5f ,secondNum = 20.2f , thirdNum = 25.2f;
    static String firststr = "Shraddha", secondstr = "Manish", thirdstr = "Mokshit";
    static int num;
    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }
    public static void findMaximum(Float firstNum, Float secondNum, Float thirdNum) {
        Float maximumNumber;

        if(firstNum.compareTo(secondNum)>0 && firstNum.compareTo(thirdNum)>0) {
            maximumNumber = firstNum;
        }
        else if(secondNum.compareTo(firstNum)>0 && secondNum.compareTo(thirdNum)>0) {
            maximumNumber = secondNum;
        }
        else {
            maximumNumber = thirdNum;
        }

        System.out.println("The maximum Float number is: " + maximumNumber);
    }

    public static void findMaximum(String firstStr, String secondStr, String thirdStr) {
        String maximumStr;

        if(firstStr.compareTo(secondStr)>0 && firstStr.compareTo(thirdStr)>0) {
            maximumStr = firstStr;
        }
        else if(secondStr.compareTo(firstStr)>0 && secondStr.compareTo(thirdStr)>0) {
            maximumStr = secondStr;
        }
        else {
            maximumStr = thirdStr;
        }

        System.out.println("The maximum Three String is: " + maximumStr);
    }
    public static <T extends Comparable<T>> void findMax(T firstNumber, T secondNumber, T thirdNumber) {
        T maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }
        System.out.println("The maximum is: " + maximumNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Computing Maximum Of Three Numbers Using Java Generics");

        while(num != 5){
            System.out.println("Enter a choice : \n 1.Max OF Three Integers \n 2.Max Of Three Floats \n 3.Max OF Three Characters "
                    + "\n 4.Max Of three using generics method \n 5.Exit ");
            num = scanner.nextInt();
            switch(num) {
                case 1:
                    findMaximum(firstNumber ,secondNumber,thirdNumber);
                    break;
                case 2:
                    findMaximum(firstNum,secondNum,thirdNum);
                    break;
                case 3:
                    findMaximum(firststr,secondstr,thirdstr);
                    break;
                case 4:
                    System.out.println("Using Generics");
                    findMax(firstNumber ,secondNumber,thirdNumber);
                    findMax(firstNum,secondNum,thirdNum);
                    findMax(firststr,secondstr,thirdstr);
                    break;
                default :
                    break;
            }
        }

    }

}
