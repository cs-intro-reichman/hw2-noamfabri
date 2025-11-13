//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String str = args[0];
        String strInUp = str.toUpperCase();
        String an = "aefhilmnorsx";
        int num = Integer.parseInt(args[1]);
        int len = (str.length() );
        for (int count = 0 ; count < len; count++) {    
        if (an.indexOf(str.charAt(count)) == -1) {
               System.out.println("Give me " + "a  " + (strInUp.charAt(count)) + ": " + (strInUp.charAt(count)) +"!"  ); 
       } else {
               System.out.println("Give me " + "an " + (strInUp.charAt(count)) + ": " + (strInUp.charAt(count)) + "!" );
              }                  
       }
               System.out.println("What does that spell?");
        for (int count = 0; count < num; count++) {
               System.out.println(strInUp +"!!!");
        }
    }
}
