/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public class SingleChoiceQuestion extends Question {
    public SingleChoiceQuestion(){
        super();
    }
    //Adds to the submission set by studentID
    public void addSubmission(String key, String studentID,SubmissionSet submissionSet){
        if(submissionSet.containsKey(key)){
            submissionSet.pruneSubmissions(studentID);
            ArrayList<String> currentSubmissions = (ArrayList<String>) submissionSet.get(key);
            currentSubmissions.add(studentID);
            submissionSet.put(key, currentSubmissions);
        }else{
            System.out.println("Incorrect Submission");
        }
    }
}
