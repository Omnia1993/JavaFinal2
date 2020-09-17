import java.util.Random;

public class Question_4 {
static int num;
    public static final String[] tens = {
            "", 		// 0
            "",		// 1
            "Twenty", 	// 2
            "Thirty", 	// 3
            "Forty", 	// 4
            "Fifty", 	// 5
            "Sixty", 	// 6
            "Seventy",	// 7
            "Eighty", 	// 8
            "Ninety" 	// 9
    };

    public static void main(String[] args) {
         num=Utils.getNumber("roll");
        System.out.println(rollTheDice(num));

    }

    public static int  rollTheDice(int dieSides) {
        Random randomGenerator;
        randomGenerator = new Random();
        return randomGenerator.nextInt(dieSides) + 1;


    }}

