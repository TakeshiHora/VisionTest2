package org.example;

public class Patient implements EyeExamService{
    private String name;
    private double birthday;
    private double height;
    private double weight;
    private double leftEye;
    private double rightEye;
    
    public Patient(String name,
                   double birthday,
                   double height,
                   double weight,
                   double leftEye,
                   double rightEye){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }
    /* 視力検査
     * 0.2以下であれば、trueを返す*
     * マイナスが入った場合、例外処理を行う。
     */
    public boolean eyeExam(){
        if( this.leftEye < 0 || this.rightEye < 0 ) {
            throw new IllegalArgumentException("0以下の数字が指定されています");
        }
        else if (this.leftEye < 0.2 || this.rightEye < 0.2 ){
            return true;
        }
        else {
            return false;
        }
    }
}
