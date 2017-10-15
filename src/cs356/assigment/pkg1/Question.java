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
public interface Question {
    public void setQuestion(String question);
    public void addAnswer(String key, String answer);
    public void print();
    public String get();
    public void answer();
}
