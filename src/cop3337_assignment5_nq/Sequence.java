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
        To provide method(s) that must be overridden in other classes that implement this interface.
 */
package cop3337_assignment5_nq;

public interface Sequence {

    /**
     * Finds the next element in a sequence.
     * @return the next element in the sequence.
     */
    int next();
}
