/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Josh
 */
public abstract class Question {
    private String question;
    protected Map answers;
    protected Map submissionSet;
    
    public Question(){
       answers = new LinkedHashMap();
       submissionSet = new LinkedHashMap();
    }
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void addAnswer(String key, String answer){
        answers.put(key, answer);
        submissionSet.put(key, new ArrayList<String>());
    }

    public String get(){
        return question;
    }
    
    public Map getSubmissionSet(){
        return submissionSet;
    }
    
    
    //Removes all previous submissions. Used when a student votes 
    //for a second time
    protected void pruneSubmissions(String studentID){
        submissionSet.forEach((k,v)->{
            ArrayList<String> currentSubmissions = (ArrayList<String>) v;
            if(currentSubmissions.contains(studentID)){
                currentSubmissions.remove(studentID);
                submissionSet.put(k, currentSubmissions);
            }
        });
    }
    
    
    //Outputs configured Questions
    public void print(){
        System.out.println(question);
        answers.forEach((k,v)->{
           System.out.println(k+". "+v);
        });
    }
}
