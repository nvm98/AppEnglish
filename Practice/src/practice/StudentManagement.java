package practice;
import java.util.Arrays;
import java.util.*;
public class StudentManagement 
{
    static Student[] arrStudent = new Student[100];
    public static boolean sameGroup(Student s1,Student s2)
    {
        return s1.getGroup() == s2.getGroup();
    }
    public static void removeStudent(String id)
    {
        int currentNumOfStudents = 0;
        for(int i = 0; i < arrStudent.length; i ++)
        {
            if(arrStudent[i]== null)
            {
                break;
            }
            else
            {
                currentNumOfStudents ++;
            }
        }
        for(int i = 0; i < currentNumOfStudents; i ++)
        {
            if(arrStudent[i].getId() == id)
            {
                arrStudent[i] = null;
                for(int j = i; j < currentNumOfStudents  - 1;j ++)
                {
                    arrStudent[j] = new Student(arrStudent[j + 1]);
                }
                arrStudent[currentNumOfStudents - 1] = null;
                break; 
            }
        }
    }
    public static void studentByGroup()
    {
        int currentNumOfStudents = 0;
        for(int i = 0; i < arrStudent.length; i ++)
        {
            if(arrStudent[i]== null)
            {
                break;
            }
            else
            {
                currentNumOfStudents ++;
            }
        }
  
        boolean[] flag = new boolean[currentNumOfStudents];
        for(int i = 0; i < currentNumOfStudents ; i ++)
        {
            if(flag[i] == false)
            {
                flag[i] = true;
                System.out.println(arrStudent[i].getGroup() + ":");
                System.out.println(arrStudent[i].getInfo());
                for(int j = i + 1; j < currentNumOfStudents; j ++)
                {
                    if(sameGroup(arrStudent[j],arrStudent[i]))
                    {
                        System.out.println(arrStudent[j].getInfo());
                        flag[j] = true;
                    }
                }
            }
        }
    }
    public static void main(String[]args)
    {
       arrStudent[0] = new Student();
       arrStudent[1] = new  Student();
       arrStudent[1].setId("001");
       arrStudent[1].setGroup("K61CB");
       arrStudent[2] = new Student();
       arrStudent[2].setId("002");
       arrStudent[3] = new Student();
       arrStudent[3].setId("004");
       
       removeStudent("000");
       studentByGroup();
    }
}
