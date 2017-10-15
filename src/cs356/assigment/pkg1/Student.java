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
public class Student {
    private String id;
    private static int count;
    static{
        count=0;
    }
    Student(){
        System.out.println(count);
        count++;
        id=Integer.toString(count);
    }
}
