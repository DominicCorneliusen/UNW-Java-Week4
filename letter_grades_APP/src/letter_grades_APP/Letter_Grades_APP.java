package letter_grades_APP;
import java.util.Scanner;

class Letter_Grades_APP{   
     static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {
         System.out.print("Enter a test score:");
         int testscore = userinput.nextInt();
         //converts score into ASCII value
         int ascii = 74 - (testscore / 10);
         // F grade if below 60
         if (ascii > 68) {ascii = 70;}
         //should there be a plus or a minus?
         int posneg = testscore % 10;
         
         if (posneg <= 3 && ascii != 70) {posneg = 45;} // minus
         else if (posneg >= 7 && ascii != 70 && !(ascii == 65 && posneg >= 7)) {posneg = 43;} //plus //There's probably a better way to write this line
         else {posneg = 32;} //neither
         //put it all together
         System.out.println("Grade = " + (char)ascii + (char)posneg);
     }
 }