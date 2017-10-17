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
    
    public Question(){
       answers = new LinkedHashMap();
    }
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void addAnswer(String key, String answer){
        answers.put(key, answer);
    }

    public String get(){
        return question;
    }
    public abstract void addSubmission(String submission, String StudentID, SubmissionSet submissionSet);
    
    //Outputs configured Questions
    public void print(){
        System.out.println(question);
        answers.forEach((k,v)->{
           System.out.println(k+". "+v);
        });
    }

    public ArrayList<String> getAnswerKeys() {
        ArrayList<String> keys = new ArrayList<String>();
        answers.forEach((k,v)->{
            String val = (String) k;
            keys.add(val);
        });
        return keys;
    }
}
