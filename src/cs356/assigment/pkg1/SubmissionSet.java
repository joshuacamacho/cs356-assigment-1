/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author Josh
 */
public class SubmissionSet extends LinkedHashMap {
    
    
    
    public SubmissionSet(Question question){
        super();
        ArrayList<String> keys = question.getAnswerKeys();
        for(String key : keys){
            this.put(key, new ArrayList<String>());
        }
    }
    //Removes all previous submissions. Used when a student votes 
    //for a second time
    protected void pruneSubmissions(String studentID){
        this.forEach((k,v)->{
            ArrayList<String> currentSubmissions = (ArrayList<String>) v;
            if(currentSubmissions.contains(studentID)){
                currentSubmissions.remove(studentID);
                this.put(k, currentSubmissions);
            }
        });
    }
    
    public void printSubmissions(){
        this.forEach((k,v)->{
            ArrayList<String> ans = (ArrayList<String>) v;
            System.out.println(k+". "+ans.size());
        });
    }
}
