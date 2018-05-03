
/**
 * Write a description of FizzBuzz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FizzBuzz {
    public void execute(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            }
            if(!(i % 3 == 0 || i % 5 == 0)){
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
