/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

/**
 *
 * @author Josh
 */
public class Cs356Assigment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultipleChoiceQuestion j = new MultipleChoiceQuestion();
        j.setQuestion("How many?");
        j.addAnswer("A", "Many");
        j.addAnswer("B", "None");
        j.addAnswer("C", "A few");
        j.addAnswer("D", "Butts");
        j.print();
    }
    
}
