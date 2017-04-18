/*
    Nicolas Queijo
    PID: 5152398
    Assignment 5
    COP3337 - U04
    T/R 2:00 PM - 3:15 PM
    William Feild
    I hereby certify that this collective work is my own and none of it is the work of any other person or entity. 

    To compile and execute in FIU SCIS:
        > Have files somewhere in your buffalo server
        > Navigate to directory where files is stored using cd and ls to guide you
        > Compile using javac SequenceDemo.java Sequence.java PrimeSequence.java
        > Execute using java SequenceDemo
 
    PURPOSE:
        Determines if the next number in the sequence is prime and returns it if so.
 */
package cop3337_assignment5_nq;

public class PrimeSequence implements Sequence {

    private int number = 1;
    
    /**
     * Cycles through each number testing their prime
     * status and returns those with prime status.
     * @return next prime number in the sequence.
     */
    @Override
    public int next() {
        boolean primeFlag = false;
        while (!primeFlag) {
            number++;
            primeFlag = isPrime(number);
        }
        return number;
    }
    
    /**
     * Determines if a number is prime by testing if it
     * evenly divides by any number between the divisor
     * and the square root of the original number.
     * @param number the number to be tested.
     * @return flag indicating prime status.
     */
    public boolean isPrime(int number) {
        boolean factorFlag = false;
        int divisor = 2;
        while (!factorFlag && divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) {
                factorFlag = true;
            }
            divisor++;
        }
        return !factorFlag;
    }

}
