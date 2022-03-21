/**
 * @author 5716504
 * (Mirackson Charilus)
 *
 * Title: Challenge #6 Fizz Buzz
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program’s Functionality: This program replaces all numbers divisable by 3 with the word fizz
 * and all numbers divisable by 5 with buzz. For numbers that are divisable by 3 and 5 the program will print out fizz buzz
 * and add the sqaure of the factors.
 */
public class FizzBuzz {
    /**
     * (This main method calls the other methods)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void main(String[] args){
//call to fizzBuzz method
        fizzBuzz();


    }
    /**
     * (This method does the calculations and prints)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void fizzBuzz(){
        //for loop
        for (int i = 1; i <= 100; i++){
            //check to see if divisable by 3
            if (i % 3 == 0 && !(i % 5 == 0)){
                System.out.println("fizz");
            }
            //check to see if divisable by 5
            else if (i % 5 == 0 && !(i % 3 == 0)){
                System.out.println("buzz");
            }
            //check to see if divisable by 3 and 5
            else if (i % 3 == 0 && i % 5 == 0){
                int test = (int) Math.pow((i / 3) + (i / 5) , 2);
                System.out.println("fizz buzz " + test);
            }
            // all other numbers
            else { System.out.println(i);}
        }
    }
}
