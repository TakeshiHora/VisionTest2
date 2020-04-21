package org.example;

/**
 * 視力検査の結果判定!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Patient patiant = new Patient("裕司", 19601001, 165.5,
                80.5, 0.1, 0.1);
        System.out.println(patiant.eyeExam());
    }
}
