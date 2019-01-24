/*Use HashMaps or String arrays to loop through user's input and implement the following:

Replacements:

    replace i with you
    replace me with you
    replace my with your
    replace am with are

We will continue to build on top of this application throughout the week.

Here's how the replacement works:

The user enters something at the prompt: "my teacher hates me"

The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the qualifier to the replacement string.
So, my teacher hates me becomes "Why do you say that your teacher hates you?"
The replacement method returns the same words as the user entered only the replacement words have been swapped.
Then the qualifier is prepended to the user's words.*/

import java.util.Scanner;

public class elizaIntermediate {

    public static void main(String[]args){

        System.out.println("Good day. How are you doing today?");
        Scanner input = new Scanner(System.in);
        String userResponse = " ";
        boolean userQuit;
        String elizaResponse = " ";

        do {
            System.out.println("Enter your response here, or press Q to quit.");
            userResponse = input.nextLine();
//            System.out.println(userResponse);

            // Check if user wants to quit
            userQuit = checkQuitCommand(userResponse);

            // Swap out the words as needed
            splitExample(userResponse);
            String[] words = splitWords(userResponse);
            elizaResponse = replaceWords(words);

            System.out.println(elizaResponse);


        }while (!userQuit);

        System.out.println(">>> END");
        input.close();
    }


    public static boolean checkQuitCommand(String r){

        boolean quit = false;
        if (r.equalsIgnoreCase("Q") || r.equalsIgnoreCase("I am feeling great")){
            quit = true;
        }
        return quit;
    }

    public static String replaceWords(String[] words){

        String str = " ";
        for(int i=0; i<words.length; i++){
            String word = words[i];
            if(word.equalsIgnoreCase("i")){
                word = "you";
            }else if (word.equalsIgnoreCase("me")){
                word = "you";
            }else if (word.equalsIgnoreCase("my")){
                word = "your";
            }else if (word.equalsIgnoreCase("am")){
                word = "are";
            }
            str = words[i] + " ";
        }
        return str;
    }

    //    replace i with you
    //    replace me with you
    //    replace my with your
    //    replace am with are
    public static String[] splitWords(String r){
        String[] str = new String[100];
        for(String words: r.split(" ")){
            for(int i=0; i<words.length(); i++){
                str[i] = words;
            }
        }
        return str;

    }


    public static void splitExample(String r){
            System.out.println("Return Value :" );

            for (String retval: r.split(" ")) {
                System.out.println(retval);
            }
        }

}
