/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Josh
 */
public class MultipleChoiceQuestion extends Question{
    MultipleChoiceQuestion(){
        super();
    }
    
    //Add multiple possible answers to the submission set
    @Override
    public void addSubmission(String key, String studentID, SubmissionSet submissionSet){
        String[] keys = key.split(" ");
        submissionSet.pruneSubmissions(studentID);
        for(String val : keys){
            if(submissionSet.containsKey(val)){
            ArrayList<String> currentSubmissions = (ArrayList<String>) submissionSet.get(val);
            currentSubmissions.add(studentID);
            submissionSet.put(val, currentSubmissions);
        }else{
            System.out.println("Incorrect Submission");
        }
        }
        
    }
}
