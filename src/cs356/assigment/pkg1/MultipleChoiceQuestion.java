/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356.assigment.pkg1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Josh
 */
public class MultipleChoiceQuestion implements Question{
    private String question;
    private Map answers;
    
    MultipleChoiceQuestion(){
        answers = new LinkedHashMap();
    }
    
    @Override
    public void setQuestion(String question){
        this.question = question;
    }
    
    @Override
    public void addAnswer(String key, String answer){
        answers.put(key, answer);
    }

    @Override
    public String get(){
        return question;
    }

    @Override
    public void answer(){
        
    }
    
    @Override
    public void print(){
        System.out.println(question);
        answers.forEach((k,v)->{
           System.out.println(k+". "+v);
        });
    }
}
