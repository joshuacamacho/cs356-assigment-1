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
public class IVoteService {
    private Question question;
    private SubmissionSet submissionSet;
    public IVoteService(Question question){
        this.question=question;
        this.submissionSet = new SubmissionSet(question);
    }
    
    public void setQuestionText(String question){
        this.question.setQuestion(question);
    }
    
    public void addAnswer(String key, String answer){
        this.question.addAnswer(key, answer);
        submissionSet.put(key, new ArrayList<String>());
    }
    
    public void addSubmission(String key, String studentID){
        question.addSubmission(key, studentID, submissionSet);
    }
    
    public void printSubmissions(){
        submissionSet.printSubmissions();
    }

    public void askQuestion() {
        question.print();
    }

    public ArrayList<String> getKeys() {
        return question.getAnswerKeys();
    }
    
    
}
