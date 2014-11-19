/**
 * Created by annajerofejeva on 18/11/2014.
 */
public class Fizzbuzz {
    public boolean isDivisibleByThree(int number) {
        return (number % 3 == 0);
    }

    public boolean isDivisibleByFive(int number) {
        return (number % 5 == 0);
    }

    public boolean isDivisibleByFifteen(int number) {
        return (number % 15 == 0);
    }

    public String play(int number) {
        if(isDivisibleByFifteen(number)) return "Fizzbuzz";
        else if(isDivisibleByThree(number)) return "Fizz";
        else if (isDivisibleByFive(number)) return "Buzz";
        else return String.valueOf(number);
    };
}
