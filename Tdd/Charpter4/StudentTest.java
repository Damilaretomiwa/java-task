package Charpter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("bright",80.0);
    @Test
    public void testSetStudentName(){
        student.setName("bright");
        System.out.println(student.getName());
        assertEquals("bright",student.getName());
    }
    @Test
    public void  testSetAverage(){
        student.setAverage(80.0);
        System.out.println(student.getAverage());
        assertEquals(80.0,student.getAverage());
    }
    @Test
    public  void  testGetLetterGrade(){
        student.getLetterGrade();
        System.out.println(student.getLetterGrade());
        assertEquals("B",student.getLetterGrade());
    }


}