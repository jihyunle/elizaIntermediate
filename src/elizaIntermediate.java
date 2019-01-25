/*Use HashMaps or String arrays to loop through user's input and implement the following:

Replacements:

    replace i with you
    replace me with you
    replace my with your
    replace am with are

We will continue to build on top of this application throughout the week.

Here's how the replacement works:

The user enters something at the prompt: "my teacher hates me"
The program will loop through that string and replace "my" with "your" and "me" with "you".
So, my teacher hates me becomes "Why do you say that your teacher hates you?"
The replacement method returns the same words as the user entered only the replacement words have been swapped.
*/

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
            elizaResponse = replaceWords(userResponse);

            System.out.println(elizaResponse);
            System.out.println();

        }while (!userQuit);

        System.out.println(">>> END");
        input.close();
        System.exit(0);
    }

    public static boolean checkQuitCommand(String r){

        boolean quit = false;
        if (r.equalsIgnoreCase("Q") || r.contains("i am feeling great")){
            quit = true;
        }
        return quit;
    }

    public static String replaceWords(String str){

        String[] words = str.split(" ");
        String newStr = "";

        // Use shorthand to loop each element inside array
        for(String word: words){
            //    replace i with you
            //    replace me with you
            //    replace my with your
            //    replace am with are

            if(word.equalsIgnoreCase("i")){
                word = "you";
            }else if (word.equalsIgnoreCase("me")){
                word = "you";
            }else if (word.equalsIgnoreCase("my")){
                word = "your";
            }else if (word.equalsIgnoreCase("am")){
                word = "are";
            }

            // Concatenate the contents of the array back into a String
            newStr += word + " ";

        }

        return newStr;

    }

}
