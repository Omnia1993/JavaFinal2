
//Produce a method called intToDigits that receives a single integer as a parameter, determines how many digits are in that integer and returns a string that says how many digits.  For example:
//
//int num = 2222;     // you could use Utils.getNumber here to not use the same hard coded number each time
//String answer;
//
//answer = intToDigits(num);
//System.out.println();
//
//Would produce the following results:
//
//2222 is a four digit number
public class Question_3 {
    static String answer;
    static int number;
   static int count=0;
    public static void main(String[] args) {

        number=Utils.getNumber("Enter number");

    answer=  intToDigits(number);

    }
    static String intToDigits(int num){
        while (number!=0){
            number=number/10;
            count++;
        }
        System.out.println(num +" is a "+count+" "+"digits number");

        return answer;

    }


}
