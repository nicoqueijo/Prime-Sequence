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
        To display the first one hundred prime numbers to the console.
 */
package cop3337_assignment5_nq;

public class PrimeSequenceTester {

    public static void main(String[] args) {

        final int TARGET_NUMBER_OF_PRIMES = 100;
        Sequence primes = new PrimeSequence();

        System.out.println("The first " + TARGET_NUMBER_OF_PRIMES + " prime numbers are as follows:\n");

        for (int index = 1; index <= TARGET_NUMBER_OF_PRIMES; index++) {
            // formats the output with each element in a field of length 4
            System.out.printf("%4d", primes.next());
            if (index % 10 == 0) {
                System.out.println();
            }
        }
        
        System.out.println();
    }

}
