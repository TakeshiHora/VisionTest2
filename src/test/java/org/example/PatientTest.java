package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    /*各値でのテスト*/
    @Test
    public void trueTrueEyeExamTest(){
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.1, 0.1);
        assertEquals(true, patient.eyeExam());
    }
    @Test
    public void trueFalseExamTest(){
        Patient patiant = new Patient("裕司", 19601001,
                165.5,80.0, 0.1, 1.0);
        assertEquals(true, patiant.eyeExam());
    }
    @Test
    public void falseTrueExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 1.1, 0.1);
        assertEquals(true, patient.eyeExam());
    }
    @Test
    public void falseFalseExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.5, 0.5);
        assertEquals(false, patient.eyeExam());
    }
}