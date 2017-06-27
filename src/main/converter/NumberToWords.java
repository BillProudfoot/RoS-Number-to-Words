package main.converter;

public class NumberToWords {

    public static String convert(String input) {

	    /*
	     * write your implementation here
	     */

      string singleMap [] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

      string tensMap [] = { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

      string InputToWords(int input) {
        if (input == 0)
          return "invalid";

        if (input < 0 )
        return "minus " + InputToWords(abs(input));  

        string output = "";

        if ((input/1000000) > 0 ) {
          output += InputToWords(input/1000000) + " million ";
          input %= 1000000;
        }

        if ((input/1000) > 0 ) {
          output += InputToWords(input/1000) + " thousand ";
          input %= 1000;
        }

        if ((number/100) > 0 ) {
          output += InputToWords(input/100) + " hundred ";
          input %=100;
        }

        if (input > 0) {
          if (number < 20)
            input += singleMap[input];
          else {
            output += tensMap[input];
            if ((input %10) > 0)
              output += singleMap[input % 10];
          }
        }
        return output;
}



 
