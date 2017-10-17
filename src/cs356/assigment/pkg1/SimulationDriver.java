/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Josh
 */
public class SimulationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVoteService service = new IVoteService(new MultipleChoiceQuestion());
        ArrayList<Student> students = new ArrayList<Student>();
        Random rand = new Random();
        for(int i=0; i<20; i++){
            students.add(new Student());
        }
        System.out.println("Question 1");
        service.setQuestionText("Mr. Owl, "
                + "How many licks does it take to get to the tootsie"
                + "roll center of a tootsie pop?");
        service.addAnswer("A", "One");
        service.addAnswer("B", "Two-hoo");
        service.addAnswer("C", "Three");
        service.askQuestion();
        for(Student student : students){
            ArrayList<String> keys = service.getKeys();
            String key = keys.get(rand.nextInt(keys.size()));
            service.addSubmission(key, student.getId() );
        }
        System.out.println("Submission Statistics");
        service.printSubmissions();
        
        System.out.println("----------------------------\nQuestion 2");
        service = new IVoteService(new SingleChoiceQuestion());
        service.setQuestionText("What's your favorite color?");
        service.addAnswer("1", "Blue");
        service.addAnswer("2", "Green");
        service.addAnswer("3", "Moave");
        service.addAnswer("4", "Chartreuse");
        service.addAnswer("5", "Rose Gold");
        service.askQuestion();
        for(Student student : students){
            ArrayList<String> keys = service.getKeys();
            String key = keys.get(rand.nextInt(keys.size()));
            service.addSubmission(key, student.getId() );
        }
        System.out.println("Submission Statistics");
        service.printSubmissions();
    }
    
}
