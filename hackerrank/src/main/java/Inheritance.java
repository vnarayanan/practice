import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Inheritance.pdf
 */
public class Inheritance {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();

            String lastName = scan.next();
            int id = scan.nextInt();

            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){

                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }


    }

