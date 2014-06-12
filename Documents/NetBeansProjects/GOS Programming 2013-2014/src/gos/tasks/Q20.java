/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import gos.tasks.student.Student;
import java.util.ArrayList;

/**
 *
 * @author Çağrı Çakır
 */
public class Q20 {
    
    private static ArrayList<Student> student = new ArrayList<>();

    public Q20() {
        student.add(new Student("student1"));
        student.add(new Student("student2"));
        student.add(new Student("student3"));
        student.add(new Student("student4"));
        student.add(new Student("student5"));
    }
    
    public void addElement()
    {
        student.add(new Student("student6"));
        student.add(new Student("student7"));
        student.add(new Student("student8"));
    }
    
    public void removeElement()
    {
        student.remove(student.size()-1);
    }
    
    public void showList()
    {
        for(int i=0; i<student.size(); i++)
        {
            System.out.println(student.get(i).toString());
        }
    }
    
}
