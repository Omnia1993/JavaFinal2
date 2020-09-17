import org.w3c.dom.ls.LSOutput;

public class Question_6 {
    public static void main(String[] args) {
        String array[] = new String[5];
        String strangeWords = Utils.getRandomString();

        for (int i = 0; i <= array.length; i++){
            array[i] = strangeWords;
            if (strangeWords.length() > 4)
                System.out.println("longer than 4 " + strangeWords);


    }

}}


