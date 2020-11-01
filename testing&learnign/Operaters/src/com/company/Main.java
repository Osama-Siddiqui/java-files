package com.company;



public class Main {

    public static void main(String[] args) {
/*    int result = 1 + 2;//1+2=3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("Previous result is " + previousResult);
        result = result -1;
        System.out.println("3-1 = " + result);
        System.out.println("previous result is " + previousResult);
        result = result * 10;
        System.out.println("2*10 = "+ result);
        result = result / 5;
        System.out.println("20/5 = "+ result);
        result = result % 3;
        System.out.println("4 %3 = " + result);
        result++;
        System.out.println("1+1="+result);
        result--; // 2-1 = 1
        System.out.println("2-1="+result);
        result += 2; // 1+2=3
        System.out.println("1+2 = " + result);
        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);
        // result = result / 3
        result /= 3; // result / 3 = 30 /3
        System.out.println("30 / 3 = " + result);
        result -= 2; //result - 2 = 10 -2
        System.out.println("10 -2 = "+ result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not a Alien!");
            System.out.println("And I am scared of Aliens");
        }
*/
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
            }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }


        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        //System.out.println(wasCar);
        double first  = 21.00d;
        double second = 80.00d;
        double third =  (first + second) * 100.00d;
        double fourth = third % 40.00d;
        boolean result = (fourth == 0) ? true : false;
        System.out.println("result = " + result);
        if (!result)
        {
            System.out.println("got some remainder " + fourth);

        }





    }
}
