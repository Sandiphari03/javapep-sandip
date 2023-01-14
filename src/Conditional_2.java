public class Conditional_2 {


        public static void main(String[] args) {
            // write your code here
           char gender = '0';
           byte age =30;

           if(gender == 'F') {

               if (age >= 18) {
                   System.out.println("she cant vote");
               } else {
                   System.out.println("she cannot vote ");

               }
           }else if (gender == 'M') {
               if (age >= 21) {
                   System.out.println("he can vote");
               } else {
                   System.out.println("he cannot vote ");

               }
           }else {
               System.out.println("invalid input");


           }

        }
    }



